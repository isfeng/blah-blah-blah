<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<s:form action="Create.action">
	<s:textfield label="Account's Name" name="name" />
	<s:textfield label="Account's E-Mail" name="email" />
	<s:textfield label="Account's Password" name="password" />
	<s:submit value="Create" />
</s:form>

