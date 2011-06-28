/* 
 * $Id: Dao.java 12 2010-06-28 08:20:56Z  $
 * 
 * Copyright (c) 2010 Manning Publication Co.
 */
package com.springinpractice.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @version $Id: Dao.java 12 2010-06-28 08:20:56Z  $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface Dao<T extends Object> {
	
	/**
	 * <p>
	 * If the passed object has a <code>setDateCreated(Date)</code> method then
	 * we call it, passing in the current timestamp.
	 * </p>
	 * 
	 * @param t
	 */
	void create(T t);
	
	T get(Serializable id);
	
	T load(Serializable id);
	
	List<T> getAll();
	
	void update(T t);
	
	void delete(T t);
	
	void deleteById(Serializable id);
	
	void deleteAll();
	
	long count();
	
	boolean exists(Serializable id);
}
