<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html> 
    <head> 
        <title>Insert title here</title>
    </head> 
<body> 

<h1>Tambahkan Pemohon Baru</h1>

<c:url var="saveUrl" value="pemohonadd.htm" />
<form:form modelAttribute="pemohonAttribute" method="POST" action="${saveUrl}">
	<table style="width: 100%">
		<tr>
            <td> Nama </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtNama"></td>
        </tr>    
        <tr>
            <td> No KTP / Identitas </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtNoIdentitas"></td>
        </tr>
        <tr>
            <td> Alamat </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtAlamat"></td>
        </tr>
        <tr>
            <td> Jenis </td>
            <td> : </td>
            <td>
                <select>
                <option value="yangDikuasakan"> Yang Dikuasakan </option>
                <option value="langsung"> Langsung </option>
                </select>
            </td>
        </tr>
        <tr>
            <td> Nama Pemohon </td>
            <td> : </td>
            <td> <input type="text" size="50" maxlength="100" name="txtNamaPemohon"></td>
        </tr>
        <tr>
            <td> Jenis Kelamin </td>
            <td> : </td>
            <td><select>
                <option value="Pria">Pria</option>
                <option value="Wanita">Wanita</option>
                </select>
            </td>
        </tr>
        <tr>
            <td> Tempat Lahir </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtTempatLahir"></td>
            <td> Tanggal Lahir </td>
            <td> : </td>
            <td><input type="text" size="50" maxlength="100" name="txtTanggalLahir"></td>
            <td> ddmmyyyy </td>
       </tr>   
       <tr>
           <td> NPWP </td>
           <td> : </td>
           <td><input type="text" size="50" maxlength="100" name="txtNPWP"></td>
      </tr>
      <tr>
          <td> No KTP </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtNoKTP"></td>
          <td><input type="file" value="Pilih"></td>
      </tr>
      <tr>
          <td> No HP </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtNoHp"></td>
      </tr>
      <tr>
          <td> Email </td> 
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtEmail"></td>
      </tr>
      <tr>
          <td> Pekerjaan </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtPekerjaan"></td>
      </tr>
      <tr>
          <td> Jenis Identitas Lainnya </td>
          <td> : </td>
          <form action="">
          <td><input type="radio" name="nomorIdentitasLain" value="SIM">SIM</td>
          <td><input type="radio" name="nomorIdentitasLain" value="Passport">PASSPORT</td>
          <td><input type="radio" name="nomorIdentitasLain" value="Lainnya">Lainnya</td>
          </form>
      </tr>
      <tr>
          <td> Foto Pemohon </td>
      </tr>
      <tr>
          <td><input type="file" value="pilih"></td>
      </tr>
      <tr>
          <td> Alamat </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtAlamat"></td>
      </tr>
      <tr>
          <td> Propinsi </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtPropinsi"></td>
      </tr>
      <tr>
          <td> Kota </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtKota"></td>
      </tr>
      <tr>
          <td> Kecamatan </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtKecamatan"></td>
      </tr>
      <tr>
          <td> Kelurahan/Desa </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtKelurahan"></td>
      </tr>
      <tr>
          <td> Password </td>
          <td> : </td>
          <td><input type="text" size="50" maxlength="100" name="txtPassword"></td>
      </tr>
	
	
	
	
	
	
	
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
