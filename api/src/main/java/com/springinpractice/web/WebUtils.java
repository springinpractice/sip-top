/* 
 * $Id$
 * 
 * Copyright (c) 2010 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.web;

import org.springframework.util.StringUtils;

/**
 * @version $Id$
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
