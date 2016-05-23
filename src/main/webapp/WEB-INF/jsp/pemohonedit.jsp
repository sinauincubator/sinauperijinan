<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Insert title here</title>
</head>
<body>

<h1>Edit Pemohon</h1>

<c:url var="saveUrl" value="pemohonedit.htm" />
<form:form modelAttribute="pemohonAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
			<td colspan="3" rowspan="3"><b>Detail Pemohon</b></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td width="20%"><form:label path="nama">Nama</form:label></td>
			<td width="2%">:</td>
			<td width="78%">
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
			<td><form:label path="nomorKtp">Nomor KTP/Identitas</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nomorKtp" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nomorKtp",
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
			<td><form:label path="alamatWakil">Alamat*</form:label></td>
			<td>:</td>
			<td>
				<form:input path="alamatWakil" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "alamatWakil",
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
			<td><form:label path="jenisPemohon">Jenis</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jenisPemohon" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jenisPemohon",
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
			<td><form:label path="jenisKelamin">Kelamin</form:label></td>
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
			<td><form:label path="tempatLahir">Tempat Lahir</form:label></td>
			<td>:</td>
			<td>
				<form:input path="tempatLahir" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "tempatLahir",
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
			<td><form:label path="tanggalLahir">Tanggal Lahir</form:label></td>
			<td>:</td>
			<td>
				<form:input path="tanggalLahir" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "tanggalLahir",
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
			<td><form:label path="npwp">NPWP</form:label></td>
			<td>:</td>
			<td>
				<form:input path="npwp" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "npwp",
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
			<td><form:label path="noKtpPemohon">No KTP</form:label></td>
			<td>:</td>
			<td>
				<form:input path="noKtpPemohon" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "noKtpPemohon",
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
			<td><form:label path="jenisIdentitasLain">Jenis identitas lain</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jenisIdentitasLain" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jenisIdentitasLain",
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
			<td><form:label path="noIdentitas">No Identitas</form:label></td>
			<td>:</td>
			<td>
				<form:input path="noIdentitas" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "noIdentitas",
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
			<td><form:label path="noHp">Nomor Hp*</form:label></td>
			<td>:</td>
			<td>
				<form:input path="noHp" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "noHp",
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
			<td><form:label path="email">Email</form:label></td>
			<td>:</td>
			<td>
				<form:input path="email" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "email",
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
			<td><form:label path="pekerjaan">Pekerjaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="pekerjaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "pekerjaan",
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
			<td>&nbsp;</td>
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
			<td><form:label path="propinsi">Propinsi</form:label></td>
			<td>:</td>
			<td>
				<form:input path="propinsi" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "propinsi",
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
			<td><form:label path="kota">Kota</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kota" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kota",
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
			<td><form:label path="kecamatan">Kecamatan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kecamatan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kecamatan",
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
			<td><form:label path="kelurahanDesa">Kelurahan / Desa</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kelurahanDesa" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kelurahanDesa",
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
			<td><form:label path="password">Password / Desa</form:label></td>
			<td>:</td>
			<td>
				<form:input path="password" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "password",
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
			<td colspan="3" rowspan="3"><b>Detail Perusahaan</b></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><form:label path="namaUsaha">Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="namaUsaha" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "namaUsaha",
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
			<td><form:label path="jabatan">jabatan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jabatan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jabatan",
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
			<td><form:label path="badanUsaha">Jenis Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="badanUsaha" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "badanUsaha",
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
			<td><form:label path="namaSingkat">Nama Singkat PT</form:label></td>
			<td>:</td>
			<td>
				<form:input path="namaSingkat" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "namaSingkat",
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
			<td><form:label path="alamatPerusahaan">Alamat Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="alamatPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "alamatPerusahaan",
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
			<td><form:label path="propinsiPerusahaan">Propinsi</form:label></td>
			<td>:</td>
			<td>
				<form:input path="propinsiPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "propinsiPerusahaan",
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
			<td><form:label path="kabupatenPerusahaan">Kabupaten</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kabupatenPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kabupatenPerusahaan",
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
			<td><form:label path="kecamatanPerusahaan">Kecamatan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="kecamatanPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "kecamatanPerusahaan",
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
			<td><form:label path="desaPerusahaan">Desa</form:label></td>
			<td>:</td>
			<td>
				<form:input path="desaPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "desaPerusahaan",
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
			<td><form:label path="lokasiPerusahaan">Lokasi Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="lokasiPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "lokasiPerusahaan",
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
			<td><form:label path="nomorTeleponPerusahaan">Nomor Telepon</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nomorTeleponPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nomorTeleponPerusahaan",
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
			<td><form:label path="nomorFax">Nomor Fax</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nomorFax" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nomorFax",
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
			<td><form:label path="statusTempatUsaha">Status Tempat Usaha</form:label></td>
			<td>:</td>
			<td>
				<form:input path="statusTempatUsaha" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "statusTempatUsaha",
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
			<td><form:label path="npwpPerusahaan">NPWP Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="npwpPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "npwpPerusahaan",
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
			<td><form:label path="jenisKegiatanPerusahaan">Jenis Kegiatan Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="jenisKegiatanPerusahaan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "jenisKegiatanPerusahaan",
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
			<td colspan="3" rowspan="3"><b>Legalitas Perusahaan</b></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td><form:label path="namaNotaris">Nama Notaris(hanya untuk PT dan selain Koperasi)</form:label></td>
			<td>:</td>
			<td>
				<form:input path="namaNotaris" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "namaNotaris",
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
			<td><form:label path="nomorAktaNotaris">Nomor Akta Notaris</form:label></td>
			<td>:</td>
			<td>
				<form:input path="nomorAktaNotaris" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "nomorAktaNotaris",
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
			<td><form:label path="alamatNotaris">Alamat Notaris</form:label></td>
			<td>:</td>
			<td>
				<form:input path="alamatNotaris" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "alamatNotaris",
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
			<td><form:label path="tanggalPengesahan">Tanggal Pengesahan Pihak Berwenang(hanya untuk PT dan selain Koperasi)</form:label></td>
			<td>:</td>
			<td>
				<form:input path="tanggalPengesahan" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "tanggalPengesahan",
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
			<td><form:label path="dataAktaPendiriUsaha">Data Akta Pendirian Usaha(hanya untuk PT)</form:label></td>
			<td>:</td>
			<td>
				<form:input path="dataAktaPendiriUsaha" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "dataAktaPendiriUsaha",
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
			<td><form:label path="izinLain">Izin lain yang dimiliki</form:label></td>
			<td>:</td>
			<td>
				<form:input path="izinLain" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "izinLain",
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
			<td><form:label path="modalUsaha">Modal Perusahaan</form:label></td>
			<td>:</td>
			<td>
				<form:input path="modalUsaha" cssStyle="width:75%"/>
				<script type="text/javascript">
				Spring.addDecoration(new Spring.ElementDecoration({
					elementId : "modalUsaha",
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
	<h2>Detail Pengurus Perusahaan</h2>
	<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>Nama</th>
			<th>Jabatan</th>
			<th>Jenis Kelamin</th>
			<th>Phone No</th>
			<th>Alamat</th>
			<th></th>
		</tr>
	</thead>
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