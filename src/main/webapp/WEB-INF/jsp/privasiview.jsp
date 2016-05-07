<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1><a href="privasiadd.htm">Daftar Privasi Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
			<th>Role ID</th>
			<th>Role Name</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${privasis}" var="privasi">
			<c:url var="editUrl" value="privasiedit.htm?id=${privasi.idPrivasi}" />
		<tr>
			<td><c:out value="${privasi.idPrivasi}" /></td>
			<td><c:out value="${privasi.roleName}" /></td>
			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
