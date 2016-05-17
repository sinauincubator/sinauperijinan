<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="masterprofiladd.htm">Profil</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<td>Instansi</td>
			<td>:</td>
			<td>
			<select class="" name="instansi">
				<option values="1">BPPT</option>
			</select>
			</td>
			</tr>
	          <tr>
	            <td>Nama</td>
	            <td>:</td>
	            <td>
	              <input type="text" name="nama" placeholder="nama">
	            </td>
	          </tr>
	          <tr>
	            <td>Alamat</td>
	            <td>:</td>
	            <td>
	              <input type="text" name="alamat" placeholder="alamat">
	            </td>
	          </tr>
	          <tr>
	            <td>Provinsi</td>
	            <td>:</td>
	            <td>
	              <select class="" name="provinsi">
	                <option values="1">Jawa Barat</option>
	              </select>
	            </td>
	          </tr>
	          <tr>
	            <td>Kota</td>
	            <td>:</td>
	            <td>
	              <select class="" name="kota">
	                <option values="1">Bekasi</option>
	              </select>
	            </td>
	          </tr>
	          <tr>
	            <td>Kelurahan</td>
	            <td>:</td>
	            <td>
	              <select class="" name="kota">
	                <option values="1">Bekasi</option>
	              </select>
	            </td>
	          </tr>
	          <tr>
	            <td>Kode Pos</td>
	            <td>:</td>
	            <td>
	              <input type="text" name="kodepos">
	            </td>
	          </tr>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${masterkblis}" var="masterkbli">
			<c:url var="editUrl" value="masterkbli.htm?id=${masterkbli.kbli}" />
		<tr>
			<td><c:out value="${masterkbli.kbli}" /></td>
			<td><c:out value="${masterkbli.deskripsi}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
