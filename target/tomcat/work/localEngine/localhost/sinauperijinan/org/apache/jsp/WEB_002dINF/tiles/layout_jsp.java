package org.apache.jsp.WEB_002dINF.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\t\t<title>");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"/sinauperijinan/styles/simplicity/theme.css\" />\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/sinauperijinan/scripts/prototype.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/sinauperijinan/scripts/scriptaculous.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/sinauperijinan/scripts/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("    </head>\r\n");
      out.write("<body class=\"tundra\">\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("    <div id=\"header\" class=\"clearfix\">\r\n");
      out.write("\t\t<div id=\"branding\">\r\n");
      out.write("\t    \t\t<h1><a href=\"welcome.htm\">Aplikasi Perizinan Pemda</a></h1>\r\n");
      out.write("\t    \t\t<p>Melayani perizinan anda dengan mudah, cepat dan transparan.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr/>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("     <div id=\"content\" class=\"clearfix\">\r\n");
      out.write("     \t<div id=\"main\">\r\n");
      out.write("        \t");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"nav\">\r\n");
      out.write("         \t<div class=\"wrapper\">\r\n");
      out.write("            \t<ul id=\"primary-nav\" class=\"menuList\">\r\n");
      out.write("\t    \t\t\t<li class=\"pad\">&nbsp;</li>\r\n");
      out.write("\t                <li>\r\n");
      out.write("\t    \t        \t<a href=\"welcome.htm\" title=\"Home\" class=\"current\" >Home</a>\r\n");
      out.write("\t    \t\t    </li>\r\n");
      out.write("\t                <li class=\"menubar\">\r\n");
      out.write("\t                \t<a href=\"\" title=\"Master\" class=\"current\" >Master</a>\r\n");
      out.write("\t                    <ul>\r\n");
      out.write("\t        \t\t    \t<li>\r\n");
      out.write("\t                        \t<a href=\"pemohonview.htm\" title=\"Master Pemohon\">Master Pemohon</a>\r\n");
      out.write("\t            \t\t\t</li>\r\n");
      out.write("\t            \t\t\t<li>\r\n");
      out.write("\t                        \t<a href=\"masterizinview.htm\" title=\"Master Izin\">Master Izin</a>\r\n");
      out.write("\t            \t\t\t</li>\r\n");
      out.write("\t            \t\t\t<li>\r\n");
      out.write("\t                        \t<a href=\"masterprofiledit.htm\" title=\"Master Profil\">Master Profil</a>\r\n");
      out.write("\t            \t\t\t</li>\r\n");
      out.write("\t            \t\t\t<li class=\"last\">\r\n");
      out.write("\t                        \t<a href=\"masterkbliview.htm\" title=\"Master KBLI\">Master KBLI</a>\r\n");
      out.write("\t            \t\t\t</li>\r\n");
      out.write("\t            \t\t</ul>\r\n");
      out.write("\t                </li>\r\n");
      out.write("\t                <li class=\"menubar\">\r\n");
      out.write("\t                \t<a href=\"\" title=\"Perizinan\" class=\"current\" >Perizinan</a>\r\n");
      out.write("\t                    <ul>\r\n");
      out.write("\t                    \t<li class=\"menubar\">\r\n");
      out.write("\t\t\t                \t<a href=\"\" title=\"Permohonan Izin\">Permohonan Izin</a>\r\n");
      out.write("\t\t\t                    <ul>\r\n");
      out.write("\t\t\t        \t\t    \t<li>\r\n");
      out.write("\t\t                        \t\t<a href=\"#\" title=\"Tambah Baru\">Tambah Baru</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Perpanjang Izin\">Perpanjang Izin</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Perubahan Izin\">Perubahan Izin</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li class=\"last\">\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Lihat Data Izin\">Lihat Data Izin</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t</ul>\r\n");
      out.write("\t                \t\t</li>\r\n");
      out.write("\t            \t\t\t<li class=\"menubar last\">\r\n");
      out.write("\t\t\t                \t<a href=\"\" title=\"Proses Izin\" >Proses Izin</a>\r\n");
      out.write("\t\t\t                    <ul>\r\n");
      out.write("\t\t\t        \t\t    \t<li>\r\n");
      out.write("\t\t                        \t\t<a href=\"administrasiview.htm\" title=\"Administrasi\">Administrasi</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Survey\">Survey</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Kepala Seksi\">Kepala Seksi</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"#\" title=\"Kepala Bagian\">Kepala Bagian</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"kepalabidangview.htm\" title=\"Kepala Bidang\">Kepala Bidang</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li>\r\n");
      out.write("\t\t\t                        \t<a href=\"sekretariatview.htm\" title=\"Sekretariat\">Sekretariat</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t\t<li class=\"last\">\r\n");
      out.write("\t\t\t                        \t<a href=\"kepalabadanview.htm\" title=\"Kepala Badan\">Kepala Badan</a>\r\n");
      out.write("\t\t\t            \t\t\t</li>\r\n");
      out.write("\t\t\t            \t\t</ul>\r\n");
      out.write("\t                \t\t</li>\r\n");
      out.write("\t            \t\t</ul>\r\n");
      out.write("\t                </li>\r\n");
      out.write("\t                <li class=\"menubar\">\r\n");
      out.write("\t\t\t            <a href=\"\" title=\"Pencetakan\" class=\"current\" >Pencetakan</a>\r\n");
      out.write("\t\t\t            <ul>\r\n");
      out.write("\t\t\t        \t\t<li class=\"last\">\r\n");
      out.write("\t\t\t                \t<a href=\"#\" title=\"Pencetakan Izin\">Pencetakan Izin</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t        \t</ul>\r\n");
      out.write("\t\t\t        </li>\r\n");
      out.write("\t\t\t        <li class=\"menubar\">\r\n");
      out.write("\t\t\t            <a href=\"\" title=\"Laporan\" class=\"current\" >Laporan</a>\r\n");
      out.write("\t\t\t            <ul>\r\n");
      out.write("\t\t\t        \t\t<li>\r\n");
      out.write("\t\t\t                \t<a href=\"#\" title=\"Monitoring\">Monitoring</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t            \t<li class=\"last\">\r\n");
      out.write("\t\t\t                \t<a href=\"#\" title=\"Summary\">Summary</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t        \t</ul>\r\n");
      out.write("\t\t\t        </li>\r\n");
      out.write("\t\t\t        <li class=\"menubar\">\r\n");
      out.write("\t\t\t            <a href=\"\" title=\"Privasi Pengguna\" class=\"current\" >Privasi Pengguna</a>\r\n");
      out.write("\t\t\t            <ul>\r\n");
      out.write("\t\t\t            \t<li>\r\n");
      out.write("\t\t\t                \t<a href=\"privasiview.htm\" title=\"Privasi\">Privasi</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t            \t<li>\r\n");
      out.write("\t\t\t                \t<a href=\"penggunaview.htm\" title=\"Pengguna\">Pengguna</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t            \t<li class=\"last\">\r\n");
      out.write("\t\t\t                \t<a href=\"#\" title=\"Profil Saya\">Profil Saya</a>\r\n");
      out.write("\t\t\t            \t</li>\r\n");
      out.write("\t\t\t        \t</ul>\r\n");
      out.write("\t\t\t        </li>\r\n");
      out.write("\t                <li>\r\n");
      out.write("\t                \t<a href=\"#\" title=\"Logout\" class=\"current\" >Logout</a>\r\n");
      out.write("\t            \t</li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            <hr/>\r\n");
      out.write("\t\t</div><!-- end nav -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"footer\" class=\"clearfix\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"divider\"><div></div></div>\r\n");
      out.write("    <span class=\"right\">Copyright <b>SinauCyberspace&#8482;</b> Workaround &copy; 2016\r\n");
      out.write("    </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f0.setParent(null);
    // /WEB-INF/tiles/layout.jsp(8,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("title");
    // /WEB-INF/tiles/layout.jsp(8,9) name = ignore type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setIgnore(true);
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f0 = _jspx_th_tiles_005finsertAttribute_005f0.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f0.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fignore_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/tiles/layout.jsp(16,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/dojo/dojo.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/tiles/layout.jsp(17,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/spring/Spring.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/tiles/layout.jsp(18,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/spring/Spring-Dojo.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/tiles/layout.jsp(19,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/dijit/themes/tundra/tundra.css");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = (org.apache.tiles.jsp.taglib.InsertAttributeTag) _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.get(org.apache.tiles.jsp.taglib.InsertAttributeTag.class);
    _jspx_th_tiles_005finsertAttribute_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsertAttribute_005f1.setParent(null);
    // /WEB-INF/tiles/layout.jsp(33,9) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("body");
    int[] _jspx_push_body_count_tiles_005finsertAttribute_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_tiles_005finsertAttribute_005f1 = _jspx_th_tiles_005finsertAttribute_005f1.doStartTag();
      if (_jspx_th_tiles_005finsertAttribute_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_tiles_005finsertAttribute_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_tiles_005finsertAttribute_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_tiles_005finsertAttribute_005f1.doFinally();
      _005fjspx_005ftagPool_005ftiles_005finsertAttribute_0026_005fname_005fnobody.reuse(_jspx_th_tiles_005finsertAttribute_005f1);
    }
    return false;
  }
}
