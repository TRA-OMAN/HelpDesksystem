package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BusinessObjectLayer.Employee;

public final class Master_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_if_test.release();
    _jspx_tagPool_t_import_url_nobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- JavaScript Bundle with Popper -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"js/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <header class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\n");
      out.write("        <a href=\"/\" class=\"d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none\">\n");
      out.write("            <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\"><use xlink:href=\"#bootstrap\"></use></svg>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <ul class=\"nav col-12 col-md-auto mb-2 justify-content-center mb-md-0\">\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-secondary\">Home</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">Features</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">Pricing</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">FAQs</a></li>\n");
      out.write("            <li><a href=\"#\" class=\"nav-link px-2 link-dark\">About</a></li>\n");
      out.write("            ");
      if (_jspx_meth_t_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 text-end\">\n");
      out.write("            ");
      if (_jspx_meth_t_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            ");
      //  t:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_t_if_2.setPageContext(_jspx_page_context);
      _jspx_th_t_if_2.setParent(null);
      _jspx_th_t_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ses_emp != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_t_if_2 = _jspx_th_t_if_2.doStartTag();
      if (_jspx_eval_t_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                ");
 HttpSession ses_emp = request.getSession();
                    String email = ((Employee)ses_emp.getAttribute("ses_emp")).getEmail();
                    if (request.getParameter("logout") != null) {
                        ses_emp.removeAttribute("ses_emp");
                        response.sendRedirect("Master.jsp?p=login");
                    }
                
          out.write("\n");
          out.write("                \n");
          out.write("                <a href=\"Master.jsp?p=account\" class=\"btn btn-outline-primary me-2\">Hello,");
          out.print(email);
          out.write("</a>\n");
          out.write("                <a href=\"Master.jsp?logout=out\"   class=\"btn btn-primary\">Logout</a>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_t_if_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_2);
        return;
      }
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_2);
      out.write("   \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_t_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_t_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_t_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_t_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content rounded-5 shadow\">\n");
      out.write("            <div class=\"modal-header p-5 pb-4 border-bottom-0\">\n");
      out.write("                <!-- <h5 class=\"modal-title\">Modal title</h5> -->\n");
      out.write("                <h2 class=\"fw-bold mb-0\">Sign up for free</h2>\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"modal-body p-5 pt-0\">\n");
      out.write("                <form class=\"\" method=\"post\" action=\"EmployeeServlet\">\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input type=\"email\"  name=\"Email\" class=\"form-control rounded-4\" id=\"floatingInput\" placeholder=\"name@example.com\">\n");
      out.write("                        <label for=\"floatingInput\">Email address</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input type=\"password\" name=\"Password\" class=\"form-control rounded-4\" id=\"floatingPassword\" placeholder=\"Password\">\n");
      out.write("                        <label for=\"floatingPassword\">Password</label>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"w-100 mb-2 btn btn-lg rounded-4 btn-primary\" name=\"signup\" value=\"signup\" type=\"submit\">Sign up</button>\n");
      out.write("                    <small class=\"text-muted\">By clicking Sign up, you agree to the terms of use.</small>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_0.setPageContext(_jspx_page_context);
    _jspx_th_t_if_0.setParent(null);
    _jspx_th_t_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ses_emp != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_0 = _jspx_th_t_if_0.doStartTag();
    if (_jspx_eval_t_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li><a href=\"list\" class=\"nav-link px-2 link-dark\">Manage Requests</a></li>\n");
        out.write("            \n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_t_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
    return false;
  }

  private boolean _jspx_meth_t_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_1.setPageContext(_jspx_page_context);
    _jspx_th_t_if_1.setParent(null);
    _jspx_th_t_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ses_emp == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_1 = _jspx_th_t_if_1.doStartTag();
    if (_jspx_eval_t_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <a href=\"Master.jsp?p=login\" class=\"btn btn-outline-primary me-2\">Login</a>\n");
        out.write("                <a href=\"Master.jsp?p=regester\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" class=\"btn btn-primary\">Sign-up</a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_t_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_1);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_1);
    return false;
  }

  private boolean _jspx_meth_t_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_3.setPageContext(_jspx_page_context);
    _jspx_th_t_if_3.setParent(null);
    _jspx_th_t_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.p eq 'login'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_3 = _jspx_th_t_if_3.doStartTag();
    if (_jspx_eval_t_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_t_import_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_t_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_3);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_3);
    return false;
  }

  private boolean _jspx_meth_t_import_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_t_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_t_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_t_import_0.setPageContext(_jspx_page_context);
    _jspx_th_t_import_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_if_3);
    _jspx_th_t_import_0.setUrl("login.jsp");
    int[] _jspx_push_body_count_t_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_t_import_0 = _jspx_th_t_import_0.doStartTag();
      if (_jspx_th_t_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_import_0.doFinally();
      _jspx_tagPool_t_import_url_nobody.reuse(_jspx_th_t_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_t_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_4.setPageContext(_jspx_page_context);
    _jspx_th_t_if_4.setParent(null);
    _jspx_th_t_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.p eq 'regester'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_4 = _jspx_th_t_if_4.doStartTag();
    if (_jspx_eval_t_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_t_import_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_t_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_4);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_4);
    return false;
  }

  private boolean _jspx_meth_t_import_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_t_import_1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_t_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_t_import_1.setPageContext(_jspx_page_context);
    _jspx_th_t_import_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_if_4);
    _jspx_th_t_import_1.setUrl("regester.jsp");
    int[] _jspx_push_body_count_t_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_t_import_1 = _jspx_th_t_import_1.doStartTag();
      if (_jspx_th_t_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_import_1.doFinally();
      _jspx_tagPool_t_import_url_nobody.reuse(_jspx_th_t_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_t_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_5.setPageContext(_jspx_page_context);
    _jspx_th_t_if_5.setParent(null);
    _jspx_th_t_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.p eq 'account'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_5 = _jspx_th_t_if_5.doStartTag();
    if (_jspx_eval_t_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_t_import_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_if_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_t_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_5);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_5);
    return false;
  }

  private boolean _jspx_meth_t_import_2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_t_import_2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_t_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_t_import_2.setPageContext(_jspx_page_context);
    _jspx_th_t_import_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_if_5);
    _jspx_th_t_import_2.setUrl("Account.jsp");
    int[] _jspx_push_body_count_t_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_t_import_2 = _jspx_th_t_import_2.doStartTag();
      if (_jspx_th_t_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_import_2.doFinally();
      _jspx_tagPool_t_import_url_nobody.reuse(_jspx_th_t_import_2);
    }
    return false;
  }

  private boolean _jspx_meth_t_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_t_if_6.setPageContext(_jspx_page_context);
    _jspx_th_t_if_6.setParent(null);
    _jspx_th_t_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.p eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_t_if_6 = _jspx_th_t_if_6.doStartTag();
    if (_jspx_eval_t_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_t_import_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_t_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_6);
      return true;
    }
    _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_6);
    return false;
  }

  private boolean _jspx_meth_t_import_3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_t_import_3 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_t_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_t_import_3.setPageContext(_jspx_page_context);
    _jspx_th_t_import_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_if_6);
    _jspx_th_t_import_3.setUrl("Admin.jsp");
    int[] _jspx_push_body_count_t_import_3 = new int[] { 0 };
    try {
      int _jspx_eval_t_import_3 = _jspx_th_t_import_3.doStartTag();
      if (_jspx_th_t_import_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_import_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_import_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_import_3.doFinally();
      _jspx_tagPool_t_import_url_nobody.reuse(_jspx_th_t_import_3);
    }
    return false;
  }
}
