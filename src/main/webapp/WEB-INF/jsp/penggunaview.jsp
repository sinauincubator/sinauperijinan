<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="penggunaadd.htm">Daftar Pengguna Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>NIP</th>
			<th>Nama Lengkap</th>
			<th>Role Manajemen</th>
			<th>User ID</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${penggunas}" var="pengguna">
			<c:url var="editUrl" value="penggunaedit.htm?idPengguna=${pengguna.idPengguna}" />
		<tr>
			<td><c:out value="${pengguna.idPengguna}" /></td>
			<td><c:out value="${pengguna.namaLengkap}" /></td>
			<td><c:out value="${pengguna.roleManajemen}" /></td>
			<td><c:out value="${pengguna.userID}" /></td>

			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
