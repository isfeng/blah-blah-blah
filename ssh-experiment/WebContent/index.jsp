<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<s:form action="Login">
	<s:textfield label="E-Mail" name="email" />
	<s:textfield label="Password" name="password" />
	<s:submit value="Login" />
</s:form>

