/*
 * JSP generated by Resin-4.0.44 (built Wed, 22 Apr 2015 02:02:11 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _login__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_1.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
    _caucho_expr_2.print(out, _jsp_env, false);
    out.write(_jsp_string5, 0, _jsp_string5.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string6, 0, _jsp_string6.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string7, 0, _jsp_string7.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string8, 0, _jsp_string8.length);
    _caucho_expr_3.print(out, _jsp_env, false);
    out.write(_jsp_string9, 0, _jsp_string9.length);
    _caucho_expr_3.print(out, _jsp_env, false);
    out.write(_jsp_string10, 0, _jsp_string10.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -1650998886690198223L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("login.jsp"), 6844959222618099714L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${pageContext.request.contextPath}");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${user.userName }");
      _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${user.password }");
      _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${errorMsg}");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;

  private final static char []_jsp_string3;
  private final static char []_jsp_string4;
  private final static char []_jsp_string2;
  private final static char []_jsp_string9;
  private final static char []_jsp_string6;
  private final static char []_jsp_string5;
  private final static char []_jsp_string10;
  private final static char []_jsp_string8;
  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  private final static char []_jsp_string7;
  static {
    _jsp_string3 = "/images/body_05.jpg) no-repeat; height: 155px\">\r\n                            <div\r\n                                    style=\"text-align: left; width: 265px; float: right; height: 125px; _height: 95px\">\r\n                                <table border=0 cellSpacing=0 cellPadding=0 width=\"100%\">\r\n                                    <tbody>\r\n                                    <tr>\r\n                                        <td style=\"height: 45px\"><input type=\"text\" class=input\r\n                                                                        value=\"".toCharArray();
    _jsp_string4 = "\" name=\"userName\"\r\n                                                                        id=\"userName\"></td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td><input type=\"password\" class=input value=\"".toCharArray();
    _jsp_string2 = "/images/body_03.jpg\"></div>\r\n                <div style=\"background-color: #278296\">\r\n                    <div style=\"margin: 0px auto; width: 936px\">\r\n                        <div\r\n                                style=\"BACKGROUND: url(".toCharArray();
    _jsp_string9 = "' != '') {\r\n        alert('".toCharArray();
    _jsp_string6 = "/images/btn1.jpg\"\r\n                                                type=image name=btnLogin onclick=\"javascript:login();return false;\">\r\n                                        </td>\r\n                                        <td width=100 align=middle><input\r\n                                                style=\"border-right-width: 0px; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px\"\r\n                                                id=btnReset src=\"".toCharArray();
    _jsp_string5 = "\" name=\"password\"\r\n                                                   id=\"password\"/></td>\r\n                                    </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                            </div>\r\n                            <div style=\"height: 1px; clear: both\"></div>\r\n                            <div style=\"width: 380px; float: right; clear: both\">\r\n                                <table border=0 cellSpacing=0 cellPadding=0 width=300>\r\n                                    <tbody>\r\n\r\n                                    <tr>\r\n                                        <td width=100 align=right><input\r\n                                                style=\"border-right-width: 0px; border-top-width: 0px; border-bottom-width: 0px; border-left-width: 0px\"\r\n                                                id=btnLogin src=\"".toCharArray();
    _jsp_string10 = "');\r\n    }\r\n</script>".toCharArray();
    _jsp_string8 = "/images/body_06.jpg\"></div>\r\n            </td>\r\n        </tr>\r\n        <tr style=\"height: 30%\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        </tbody>\r\n    </table>\r\n</form>\r\n</body>\r\n</html>\r\n<script type=text/javascript>\r\n    if ('".toCharArray();
    _jsp_string1 = "/user/login.do\">\r\n    <div></div>\r\n    <table style=\"margin: auto; width: 100%; height: 100%\" border=0\r\n           cellSpacing=0 cellPadding=0>\r\n        <tbody>\r\n        <tr>\r\n            <td height=150>&nbsp;</td>\r\n        </tr>\r\n        <tr style=\"height: 254px\">\r\n            <td>\r\n                <div style=\"margin: 0px auto; width: 936px\"><img\r\n                        style=\"display: block\" src=\"".toCharArray();
    _jsp_string0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//Dtd HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n    <title>\u68c9\u82b1\u671f\u8d27\u4ea4\u6613\u8ba1\u7b97\u7cfb\u7edf\u767b\u5f55</title>\r\n    \r\n    <style type=text/css>\r\n        body {\r\n            text-align: center;\r\n            padding-bottom: 0px;\r\n            background-color: #ddeef2;\r\n            margin: 0px;\r\n            padding-left: 0px;\r\n            padding-right: 0px;\r\n            padding-top: 0px\r\n        }\r\n\r\n        A:link {\r\n            COLOR: #000000;\r\n            text-decoration: none\r\n        }\r\n\r\n        A:visited {\r\n            COLOR: #000000;\r\n            text-decoration: none\r\n        }\r\n\r\n        A:hover {\r\n            COLOR: #ff0000;\r\n            text-decoration: underline\r\n        }\r\n\r\n        A:active {\r\n            text-decoration: none\r\n        }\r\n\r\n        .input {\r\n            border-bottom: #ccc 1px solid;\r\n            border-left: #ccc 1px solid;\r\n            line-height: 20px;\r\n            width: 182px;\r\n            height: 20px;\r\n            border-top: #ccc 1px solid;\r\n            border-right: #ccc 1px solid\r\n        }\r\n\r\n        .input1 {\r\n            border-bottom: #ccc 1px solid;\r\n            border-left: #ccc 1px solid;\r\n            line-height: 20px;\r\n            width: 120px;\r\n            height: 20px;\r\n            border-top: #ccc 1px solid;\r\n            border-right: #ccc 1px solid;\r\n        }\r\n    </style>\r\n    <script type=\"text/javascript\">\r\n        function login() {\r\n            var userName = $(\"#userName\").val();\r\n            var password = $(\"#password\").val();\r\n            var roleName = $(\"#roleName\").val();\r\n            if (userName == null || userName == \"\") {\r\n                alert(\"\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a\uff01\");\r\n                return;\r\n            }\r\n            if (password == null || password == \"\") {\r\n                alert(\"\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a\uff01\");\r\n                return;\r\n            }\r\n            $(\"#adminlogin\").submit();\r\n\r\n        }\r\n    </script>\r\n</head>\r\n<body>\r\n<form id=adminlogin method=post\r\n      name=adminlogin action=\"".toCharArray();
    _jsp_string7 = "/images/btn2.jpg\"\r\n                                                type=image name=btnReset\r\n                                                onclick=\"javascript:adminlogin.reset();return false;\"></td>\r\n                                    </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div style=\"margin: 0px auto; width: 936px\"><img\r\n                        src=\"".toCharArray();
  }
}
