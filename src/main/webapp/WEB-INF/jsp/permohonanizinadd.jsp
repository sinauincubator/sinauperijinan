<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>Insert title here</title>
    </head>
<body>

<h1>Tambahkan Perizinan Baru</h1>

<c:url var="saveUrl" value="permohonanizinadd.htm" />
<form:form modelAttribute="permohonanIzinAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
	<tr>
		<td width="10%"><form:label path="nomorPermintaan">Nomor Permintaan</form:label></td>
		<td width="2%">:</td>
		<td width="88%">
			<form:input path="nomorPermintaan" cssStyle="width:75%"/>
			<script type="text/javascript">
			Spring.addDecoration(new Spring.ElementDecoration({
				elementId : "nomorPermintaan",
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
		<td><form:label path="namaPemohon">Nama Pemohon</form:label></td>
		<td>:</td>
		<td>
			<form:input path="namaPemohon" cssStyle="width:75%"/>
			<script type="text/javascript">
			Spring.addDecoration(new Spring.ElementDecoration({
				elementId : "namaPemohon",
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
		<td><form:label path="idPemohon">ID Pemohon</form:label></td>
		<td>:</td>
		<td>
			<form:input path="idPemohon" cssStyle="width:75%"/>
			<script type="text/javascript">
			Spring.addDecoration(new Spring.ElementDecoration({
				elementId : "idPemohon",
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
	<td><form:label path="namaPerusahaan">Nama Perusahaan</form:label></td>
	<td>:</td>
	<td>
		<form:input path="namaPerusahaan" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "namaPerusahaan",
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
	<td><form:label path="noIzin">No Izin</form:label></td>
	<td>:</td>
	<td>
		<form:input path="noIzin" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "noIzin",
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
	<td><form:label path="status">Status</form:label></td>
	<td>:</td>
	<td>
		<form:input path="status" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "status",
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
	<td><form:label path="prosesSelanjutnya">Proses Selanjutnya</form:label></td>
	<td>:</td>
	<td>
		<form:input path="prosesSelanjutnya" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "prosesSelanjutnya",
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
	<td><form:label path="tglInput">Tanggal Input</form:label></td>
	<td>:</td>
	<td>
		<form:input path="tglInput" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "tglInput",
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
<td><form:label path="tglSelesai">Tanggal Selesai</form:label></td>
<td>:</td>
<td>
	<form:input path="tglSelesai" cssStyle="width:75%"/>
	<script type="text/javascript">
	Spring.addDecoration(new Spring.ElementDecoration({
		elementId : "tglSelesai",
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
<td><form:label path="entryOleh">Entry Oleh</form:label></td>
<td>:</td>
<td>
	<form:input path="entryOleh" cssStyle="width:75%"/>
	<script type="text/javascript">
	Spring.addDecoration(new Spring.ElementDecoration({
		elementId : "entryOleh",
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
