<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Edit KBLI</h1>

<c:url var="saveUrl" value="masterkbliedit.htm" />
<form:form modelAttribute="masterKbliAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
			<td width="10%"><form:label path="kbli">KBLI</form:label></td>
			<td width="2%">:</td>
			<td width="88%">
				<form:input path="kbli" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kbli",
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
			<td><form:label path="deskripsi">Deskripsi</form:label></td>
			<td>:</td>
			<td>
				<form:input path="deskripsi" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "deskripsi",
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