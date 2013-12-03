<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<table>
	<tr>
		<th></th>
		<th>Name</th>
		<th>E-Mail</th>
		<th>Password</th>
	</tr>

<s:iterator value="accounts">
	<tr>
	<td>
	<form action='Delete.action'>
		<input type='hidden' name=id value='<s:property value="id" />' /> <input
			type='submit' value='Delete' title='Delete' />
	</form>
	</td>
	<td><s:a action="Edit.action"><s:param name="id" value="id"/><s:property value="name" /></s:a></td>
	<td><s:property value="email" /></td>
	<td><s:property value="password" /></td>
	</tr>
</s:iterator>

</table>

<br/>

<s:a action="New" namespace="accounts">Create new Account</s:a>
