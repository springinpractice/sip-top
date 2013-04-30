/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <p>
 * Exception indicating that a requested resource could not be found.
 * </p>
 * 
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
