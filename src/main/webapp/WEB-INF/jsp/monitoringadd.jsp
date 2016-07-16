<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags" %>

<html>
    <head>
        <title>Insert title here</title>
    </head>
<body>

<h1>Tambah Monitoring</h1>

<tg:usermessage></tg:usermessage>

<c:url var="saveUrl" value="${addLink}" />
<form:form modelAttribute="monitoringAttribute" method="POST" action="${saveUrl}">
	<table style="width: 90%; margin-left: 3em;">
		<tr>
			<td width="5%"><form:label path="pengesahan">Pengesahan</form:label></td>
			<td width="1%">:</td>
			<td width="75">
				<form:input path="pengesahan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "pengesahan",
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
			<td><form:label path="noPermintaan">No Permintaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="noPermintaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "noPermintaan",
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
			<td><form:label path="kodeIzin">Kode Izin</form:label></td>
			<td>:</td>
			<td>
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
			<td><form:label path="nomorIzin">Nomor Izin</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nomorIzin" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nomorIzin",
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
			<td><form:label path="aging">Aging(Hari)</form:label></td>
			<td>:</td>
			<td>
				<form:input path="aging" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "aging",
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
				<input id="submit" type="submit" value="Save" style="width: 8em;"/>
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