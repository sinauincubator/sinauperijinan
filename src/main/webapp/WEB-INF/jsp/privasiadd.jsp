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
		<td width="10%"><form:label path="idPrivasi">Role ID</form:label></td>
		<td width="2%">:</td>
		<td width="88%">
			<form:input path="idPrivasi" cssStyle="width:75%"/>
			<script type="text/javascript">
			Spring.addDecoration(new Spring.ElementDecoration({
				elementId : "idPrivasi",
				widgetType : "dijit.form.ValidationTextBox",
				widgetAttrs : {
					trim : true,
					required : true
				}
			}));
			</script>
		</td>
	</tr>
	<tr>
		<td><form:label path="roleName">Role Name</form:label></td>
		<td>:</td>
		<td>
			<form:input path="roleName" cssStyle="width:75%"/>
			<script type="text/javascript">
			Spring.addDecoration(new Spring.ElementDecoration({
				elementId : "roleName",
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
