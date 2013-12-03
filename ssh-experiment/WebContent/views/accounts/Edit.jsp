<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<s:form action="Update">
	<s:textfield label="Account's Name" key="account.name"/>
	<s:textfield label="Account's E-Mail" name="email" />
	<s:textfield label="Account's Password" name="password" />
	<s:textfield value="%{account.id}"/>
	<s:submit value="Update" />
</s:form>

