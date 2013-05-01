<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="baseGoogleUrl" value="http://ajax.googleapis.com/ajax/libs" />

<c:url var="jqueryTablesorterJsUrl" value="/skin/scripts/jquery.tablesorter.min.js" />

<c:url var="sipCssUrl" value="/skin/sip.css" />
<c:url var="sipJsUrl" value="/skin/scripts/sip.js" />
<c:url var="sipCoverImgUrl" value ="/skin/images/sip-cover.png" />

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title><decorator:title /> - Spring in Practice</title>
		<link rel="stylesheet" type="text/css" href="${baseGoogleUrl}/yui/2.9.0/build/reset-fonts-grids/reset-fonts-grids.css" />
		<link rel="stylesheet" type="text/css" href="${baseGoogleUrl}/yui/2.9.0/build/base/base.css" />
		<link rel="stylesheet" type="text/css" href="${baseGoogleUrl}/jqueryui/1.8.14/themes/vader/jquery-ui.css" />
		<link rel="stylesheet" type="text/css" href="${sipCssUrl}" />
		<script type="text/javascript" src="${baseGoogleUrl}/jquery/1.6.1/jquery.min.js"></script>
		<script type="text/javascript" src="${baseGoogleUrl}/jqueryui/1.8.14/jquery-ui.min.js"></script>
		<script type="text/javascript" src="${jqueryTablesorterJsUrl}"></script>
		<script type="text/javascript" src="${sipJsUrl}"></script>
		<decorator:head />
	</head>
	<body>
		<div id="doc3">
			<div id="outerHdSubhd">
				<div id="innerHdSubhd">
					<div id="hd">
						<div id="hdTitle"></div>
						<div id="hdAppName"><c:out value="${initParam.appName}" /></div>
					</div>
					<%@ include file="/WEB-INF/jsp/skin/subhead.jspf" %>
				</div>
			</div>
			<div id="bd">
				<div class="regionInner">
					<decorator:body />
				</div>
			</div>
			<div id="ft">
				<div class="regionInner">
					<div class="yui-gc">
						<div id="aboutRecipe" class="yui-u first">
							<h2 style="margin-top:0">About recipe <c:out value="${initParam.recipe}" /></h2>
							<div><c:out value="${initParam.aboutThisRecipe}" escapeXml="false" /></div>
						</div>
						<div id="bookLinks" class="yui-u">
							<div><a href="http://www.manning.com/wheeler/"><img id="bookImg" src="${sipCoverImgUrl}" alt="Spring in Practice" /></a></div>
							<div>
								<a href="http://www.manning.com/wheeler/" title="Discuss the book with the authors and other readers">Spring in Practice @ Manning</a><br />
								<a href="http://springinpractice.com/" title="The book's blog, with elaborations, corrections and more">Spring in Practice Blog</a><br />
								<a href="https://github.com/springinpractice" title="Source code">Source Code</a><br />
							</div>
						</div>
					</div>
					<div id="legal">
						Copyright &copy; 2013 Manning Publications Co.
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
