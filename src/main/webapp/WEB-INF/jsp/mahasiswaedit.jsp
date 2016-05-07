<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Edit Mahasiswa</h1>

<c:url var="saveUrl" value="mahasiswaedit.htm?id=${mahasiswaAttribute.id}" />
<form:form modelAttribute="mahasiswaAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
			<td width="10%"><form:label path="nim">Nim</form:label></td>
			<td width="2%">:</td>
			<td width="88%">
				<form:input path="nim" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nim",
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
			<td><form:label path="nama">Nama</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nama" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nama",
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
			<td><form:label path="telp">Telp</form:label></td>
			<td>:</td>
			<td>
				<form:input path="telp" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "telp",
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