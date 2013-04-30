/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Blog   : http://springinpractice.com/
 * GitHub : https://github.com/organizations/springinpractice
 * Book   : http://manning.com/wheeler/
 * Forum  : http://www.manning-sandbox.com/forum.jspa?forumID=503
 */
package com.springinpractice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public class NumberUtils {
	private static final Logger log = LoggerFactory.getLogger(NumberUtils.class);
	
	public static int asInt(long l) {
		if (l <= Integer.MAX_VALUE) {
			return (int) l;
		} else {
			log.warn("Passed long {} > Integer.MAX_INTEGER; returning Integer.MAX_INTEGER", l);
			return Integer.MAX_VALUE;
		}
	}
}
