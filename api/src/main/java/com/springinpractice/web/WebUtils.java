/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.web;

import org.springframework.util.StringUtils;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public final class WebUtils {
	
	public static String cleanupWebUrl(String webUrl) {
		webUrl = StringUtils.trimWhitespace(webUrl);
		if (webUrl == null || "".equals(webUrl)) {
			return webUrl;
		} else {
			webUrl = webUrl.toLowerCase();
			if (webUrl.startsWith("http://") || webUrl.startsWith("https://")) {
				return webUrl;
			} else if (webUrl.startsWith("javascript:")) {
				return "#";
			} else {
				return "http://" + webUrl;
			}
		}
	}
}
