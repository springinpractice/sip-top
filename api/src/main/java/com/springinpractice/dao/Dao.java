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
	 * If the passed object has a <code>setDateCreated(Date)</code> method then we call it, passing in the current
	 * timestamp.
	 * </p>
	 * 
	 * @param t
	 */
	void create(T t);
	
	/**
	 * Finds the requested object in the data store and returns it, or null if there is no such persistent instance.
	 * 
	 * @param id ID
	 * @return requested object, or null
	 */
	T get(Serializable id);
	
	/**
	 * <p>
	 * Returns either a proxy for the requested object (one having the right class and ID), or else the actual object
	 * if it's available without hitting the data store (e.g. in cache). The basic idea behind this method is to allow
	 * apps establish references to the requested object without requiring a call to the data store.
	 * </p>
	 * <p>
	 * Use this method only if you assume the instance actually exists; i.e., non-existence is an exception.
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	T load(Serializable id);
	
	List<T> getAll();
	
	void update(T t);
	
	void delete(T t);
	
	void deleteById(Serializable id);
	
	void deleteAll();
	
	long count();
	
	boolean exists(Serializable id);
}
