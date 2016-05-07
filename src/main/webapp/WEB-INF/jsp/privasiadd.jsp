<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>Insert title here</title>
    </head>
<body>

<h1>Tambahkan Privasi Baru</h1>

<c:url var="saveUrl" value="privasiadd.htm" />
<form:form modelAttribute="privasiAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
            <td> Nama </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtNama"></td>
        </tr>

		<tr>
			<td width="10%"><form:label path="rolename">Role Name</form:label></td>
			<td width="2%">:</td>
			<td width="88%">
				<form:input path="rolename" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "rolename",
					widgetType : "dijit.form.ValidationTextBox",
					widgetAttrs : {
						trim : true,
						required : true
					}
				}));
				</script>
			</td>
		</tr>

	</table>

	<input id="submit" type="submit" value="Save" />
	<script type="text/javascript">
	    Spring.addDecoration(new Spring.ValidateAllDecoration({
		    elementId: "submit",
		    event: "onclick" }));
	</script>
	</form:form>
</body>
</html>
