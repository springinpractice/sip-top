/* 
 * $Id: ResourceNotFoundException.java 8 2010-05-23 05:10:49Z  $
 * 
 * Copyright (c) 2010 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <p>
 * Exception indicating that a requested resource could not be found.
 * </p>
 * 
 * @version $Id: ResourceNotFoundException.java 8 2010-05-23 05:10:49Z  $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() { }
	
	public ResourceNotFoundException(String message) { super(message); }
	
	public ResourceNotFoundException(Throwable cause) { super(cause); }
	
	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
