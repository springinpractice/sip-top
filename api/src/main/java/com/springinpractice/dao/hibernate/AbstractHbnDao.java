/* 
 * $Id: AbstractHbnDao.java 16 2011-04-18 05:29:18Z willie $
 * 
 * Copyright (c) 2010-2011 Manning Publications Co.
 */
package com.springinpractice.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.util.ReflectionUtils;

import com.springinpractice.dao.Dao;

// Don't put @Transactional here. It's not that it's inherently wrong--indeed it would allow us to avoid some pass-
// though service bean methods--but using @Transactional causes Spring to create proxies, and recipe 10.3 assumes that
// it has direct access to the DAOs. I don't think we're doing direct DAO injects into controllers anywhere. [WLW]

/**
 * @version $Id: AbstractHbnDao.java 16 2011-04-18 05:29:18Z willie $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public abstract class AbstractHbnDao<T extends Object> implements Dao<T> {
	@Inject private SessionFactory sessionFactory;
	private Class<T> domainClass;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	private Class<T> getDomainClass() {
	    if (domainClass == null) {
	    	ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
	        this.domainClass = (Class<T>) thisType.getActualTypeArguments()[0];
	    }
	    return domainClass;
	}
	
	private String getDomainClassName() { return getDomainClass().getName(); }
	
	public void create(T t) {
		
		// If there's a setDateCreated() method, then set the date.
		Method method = ReflectionUtils.findMethod(
				getDomainClass(), "setDateCreated", new Class[] { Date.class });
		if (method != null) {
			try {
				method.invoke(t, new Date());
			} catch (Exception e) {
				// Ignore any exception here; simply abort the setDate() attempt
			}
		}
		
		getSession().save(t);
	}
	
	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		return (T) getSession().get(getDomainClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public T load(Serializable id) {
		return (T) getSession().load(getDomainClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		Query q = getSession().createQuery("from " + getDomainClassName());
		return q.list();
	}
	
	public void update(T t) { getSession().update(t); }
	
	public void delete(T t) { getSession().delete(t); }
	
	public void deleteById(Serializable id) { delete(load(id)); }
	
	public void deleteAll() {
		Query q = getSession().createQuery("delete " + getDomainClassName());
		q.executeUpdate();
	}
	
	public long count() {
		Query q = getSession()
			.createQuery("select count(*) from " + getDomainClassName());
		return (Long) q.uniqueResult();
	}
	
	public boolean exists(Serializable id) { return (get(id) != null); }
}
