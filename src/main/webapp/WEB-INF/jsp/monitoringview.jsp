<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Insert Title Here</title>
</head>
<body>
<h1><a href="monitoringadd.htm">Tambah Monitoring Baru</a></h1>

<table style="border: 1px solid; width: 98%">
	<thead style="background:#EBDEF0">
		<tr>
            <th>Pengesahan</th>
            <th>No Permintaan</th>
            <th>Kode Izin</th>
            <th>Jenis</th>
            <th>Nomor Izin</th>
            <th>Aging(Hari)</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${monitorings}" var="monitoring">
			<c:url var="editUrl" value="monitoringedit.htm?noPermintaan=${monitoring.noPermintaan}" />
		<tr>
			<td><c:out value="${monitoring.pengesahan}" /></td>
			<td><c:out value="${monitoring.noPermintaan}" /></td>
			<td><c:out value="${monitoring.kodeIzin}" /></td>
			<td><c:out value="${monitoring.jenis}" /></td>
			<td><c:out value="${monitoring.nomorIzin}" /></td>
			<td><c:out value="${monitoring.aging}" /></td>

			<td><a href="${editUrl}">Edit</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
