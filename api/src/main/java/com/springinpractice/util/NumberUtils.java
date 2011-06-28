/* 
 * $Id$
 * 
 * Copyright (c) 2010 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version $Id$
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
