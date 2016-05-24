<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <title>Insert title here</title>
    </head>
<body>

<h1>Edit Perizinan</h1>

<c:url var="saveUrl" value="permohonanizinadd.htm" />
<form:form modelAttribute="permohonanIzinAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
	<tr>
		<td width="10%"><form:label path="namaPemohon">Nama Lengkap</form:label></td>
		<td width="2%">:</td>
		<td width="88%">
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
	<td><form:label path="tanggal">Tanggal</form:label></td>
	<td>:</td>
	<td>
		<form:input path="tanggal" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "tanggal",
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
	<td><form:label path="waktuProses">Waktu Proses</form:label></td>
	<td>:</td>
	<td>
		<form:input path="waktuProses" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "waktuProses",
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
	<td><form:label path="extDoc">Eksternal Dokumen</form:label></td>
	<td>:</td>
	<td>
		<form:input path="extDoc" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "extDoc",
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
	<td><form:label path="docNo">Nomor Dokumen</form:label></td>
	<td>:</td>
	<td>
		<form:input path="docNo" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "docNo",
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
	<td><form:label path="kode">Kode</form:label></td>
	<td>:</td>
	<td>
		<form:input path="kode" cssStyle="width:75%"/>
		<script type="text/javascript">
		Spring.addDecoration(new Spring.ElementDecoration({
			elementId : "kode",
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
<td><form:label path="keterangan">Keterangan</form:label></td>
<td>:</td>
<td>
	<form:input path="keterangan" cssStyle="width:75%"/>
	<script type="text/javascript">
	Spring.addDecoration(new Spring.ElementDecoration({
		elementId : "keterangan",
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
<td><form:label path="photo">Photo</form:label></td>
<td>:</td>
<td>
	<form:input path="photo" cssStyle="width:75%"/>
	<script type="text/javascript">
	Spring.addDecoration(new Spring.ElementDecoration({
		elementId : "photo",
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
