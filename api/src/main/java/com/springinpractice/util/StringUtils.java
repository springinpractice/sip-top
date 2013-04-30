/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.util;

/**
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
