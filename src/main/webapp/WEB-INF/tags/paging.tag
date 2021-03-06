<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="pagingRecord" required="true"
	type="com.sinau.perizinan.common.PagingRecord"%>
<%@ attribute name="pagedLink" required="false" type="java.lang.String"%>

<c:if test="${not empty viewLink}">
	<c:set var="pagedLink" value="${viewLink}"/>
</c:if>

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
			<a href="${firstUrl}">
				<span class="pagingItem">First</span>
			</a>
			<a href="${prevUrl}">
				<span class="pagingItem">&laquo; Previous</span>
			</a>
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pagingRecord.beginIndex}" end="${pagingRecord.endIndex}">
		<c:choose>
			<c:when test="${i == pageNum}">
				<span class="pagingItemCurrent"><c:out value="${i}"/></span>
			</c:when>
			<c:otherwise>				
					<a href="${pagedLink}?page=${i}">
						<span class="pagingItem"><c:out value="${i}"/></span>
					</a>				
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pagingRecord.totalPages == 0 || pageNum == pagingRecord.totalPages}">
			<span class="pagingItemCurrent">Next &raquo;</span>
			<span class="pagingItemCurrent">Last</span>
		</c:when>
		<c:otherwise>
			<a href="${nextUrl}">
				<span class="pagingItem">Next &raquo;</span>
			</a>
			<a href="${lastUrl}">
				<span class="pagingItem">Last</span>
			</a>
		</c:otherwise>
	</c:choose>
</div>

<div style="display: inline-block; float:right; width: 100%;" class="separatorDivider" >
</div>