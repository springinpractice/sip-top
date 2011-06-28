/* 
 * $Id: StringUtils.java 8 2010-05-23 05:10:49Z  $
 * 
 * Copyright (c) 2010 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.util;

/**
 * @version $Id: StringUtils.java 8 2010-05-23 05:10:49Z  $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public class StringUtils {

	/**
	 * <p>
	 * Returns a cleaned up version of the string. If the original string is
	 * <code>null</code> then we return that. Otherwise, we trim the original
	 * string. If the result is empty, then we return <code>null</code>;
	 * otherwise we return the trimmed string.
	 * </p>
	 * 
	 * @param s
	 *            original string
	 * @return cleaned up version of the string as described above
	 */
	public static String cleanup(String s) {
		if (s == null) {
			return null;
		} else {
			String trimmed = s.trim();
			return ("".equals(trimmed) ? null : trimmed);
		}
	}
}
