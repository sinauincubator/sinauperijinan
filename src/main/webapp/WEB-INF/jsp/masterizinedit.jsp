<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Edit Izin</h1>

<tg:usermessage></tg:usermessage>

<c:url var="saveUrl" value="${editLink}" />
<form:form modelAttribute="masterIzinAttribute" method="POST" action="${saveUrl}">
	<table style="width: 90%; margin-left: 3em;">
		<tr>
			<td width="5%"><form:label path="kodeIzin">Kode Izin</form:label></td>
			<td width="1%">:</td>
			<td width="75%">
				<form:input path="kodeIzin" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kodeIzin",
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
			<td><form:label path="jenis">Jenis</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jenis" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jenis",
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
			<td><form:label path="izin">Izin</form:label></td>
			<td>:</td>
			<td>
				<form:input path="izin" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "izin",
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
			<td><form:label path="dasar">Dasar</form:label></td>
			<td>:</td>
			<td>
				<form:input path="dasar" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "dasar",
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
			<td><form:label path="peraturan">Peraturan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="peraturan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "peraturan",
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
			<td><form:label path="kpi">KPI</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kpi" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kpi",
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
			<td><form:label path="aktif">Aktif</form:label></td>
			<td>:</td>
			<td>
				<form:input path="aktif" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "aktif",
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
				<input id="submit" type="submit" value="Modify" style="width: 8em;"/>
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