<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="pagingRecord" required="true"
	type="com.sinau.perizinan.common.PagingRecord"%>
<%@ attribute name="pagedLink" required="true" type="java.lang.String"%>

<link href="/sinauperijinan/styles/pagination/pagination.css" rel="stylesheet" type="text/css" />

<c:set var="pageNum" value="${(pagingRecord.currentIndex < 1) ? 1 : pagingRecord.currentIndex}"/>

<c:url var="firstUrl" value="${pagedLink}?page=1" />
<c:url var="lastUrl" value="${pagedLink}?page=${pagingRecord.totalPages}" />
<c:url var="prevUrl" value="${pagedLink}?page=${pageNum - 1}" />
<c:url var="nextUrl" value="${pagedLink}?page=${pageNum + 1}" />

<div align="Left" class="pagingSearchResult">
	<span class="pagingSearchResultTitle">Search Result</span>
</div>

<div align="right" class="pagingContentResult">
	<c:choose>
		<c:when test="${pageNum == 1}">
			<span class="pagingItemCurrent">First</span>
			<span class="pagingItemCurrent">&laquo; Previous</span>
		</c:when>
		<c:otherwise>
			<span class="pagingItem"><a href="${firstUrl}">First</a></span>
			<span class="pagingItem"><a href="${prevUrl}">&laquo; Previous</a></span>
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pagingRecord.beginIndex}" end="${pagingRecord.endIndex}">
		<c:url var="pageUrl" value="${pagedLink}?page=${i}"/>
		<c:choose>
			<c:when test="${i == pageNum}">
				<span class="pagingItemCurrent"><c:out value="${i}"/></span>
			</c:when>
			<c:otherwise>
				<span class="pagingItem">
					<a href="${pageUrl}"><c:out value="${i}"/></a>
				</span>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pageNum == pagingRecord.totalPages}">
			<span class="pagingItemCurrent">Next &raquo;</span>
			<span class="pagingItemCurrent">Last</span>
		</c:when>
		<c:otherwise>
			<span class="pagingItem"><a href="${nextUrl}">Next &raquo;</a></span>
			<span class="pagingItem"><a href="${lastUrl}">Last</a></span>
		</c:otherwise>
	</c:choose>
</div>

<div style="display: inline-block; float:right; width: 100%;" class="separatorDivider" >
</div>