<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Edit KBLI</h1>

<tg:usermessage></tg:usermessage>

<c:url var="saveUrl" value="${editLink}" />
<form:form modelAttribute="masterKbliAttribute" method="POST" action="${saveUrl}">
	<table style="width: 90%; margin-left: 3em;">
		<tr>
			<form:hidden path="id" />
			<td width="5%"><form:label path="kodeKbli">KBLI</form:label></td>
			<td width="1%">:</td>
			<td width="75">
				<form:input path="kodeKbli" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kodeKbli",
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
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td>
				<input id="submit" type="submit" value="Edit" style="width: 8em;"/>
				<script type="text/javascript">
				    Spring.addDecoration(new Spring.ValidateAllDecoration({
					    elementId: "submit",
					    event: "onclick" }));
				</script>
			</td>
		</tr>
	</table>
</form:form>

<tg:bodyfooter></tg:bodyfooter>

</body>
</html>