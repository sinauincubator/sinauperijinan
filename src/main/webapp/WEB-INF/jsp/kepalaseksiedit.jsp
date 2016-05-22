<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Verifikasi Kepala Seksi</h1>

<c:url var="saveUrl" value="kepalaseksiedit.htm" />
<form:form modelAttribute="kepalaSeksiAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
			<td width="10%"><form:label path="noPermintaan">No Permintaan</form:label></td>
			<td width="2%">:</td>
			<td width="88%">
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
			<td><form:label path="pemohon">Pemohon</form:label></td>
			<td>:</td>
			<td>
				<form:input path="pemohon" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "pemohon",
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
			<td><form:label path="jenisKelamin">Jenis Kelamin</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jenisKelamin" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jenisKelamin",
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
			<td><form:label path="noKtp">No KTP</form:label></td>
			<td>:</td>
			<td>
				<form:input path="noKtp" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "noKtp",
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
			<td><form:label path="tanggalTerima">Tanggal Terima</form:label></td>
			<td>:</td>
			<td>
				<form:input path="tanggalTerima" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "tanggalTerima",
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
			<td><form:label path="telepon">Telepon</form:label></td>
			<td>:</td>
			<td>
				<form:input path="telepon" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "telepon",
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
			<td><form:label path="jumlahIzinBelumVerifikasi">Jumlah Izin Belum Verifikasi</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jumlahIzinBelumVerifikasi" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jumlahIzinBelumVerifikasi",
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
			<td><form:label path="alamat">Alamat</form:label></td>
			<td>:</td>
			<td>
				<form:input path="alamat" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "alamat",
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