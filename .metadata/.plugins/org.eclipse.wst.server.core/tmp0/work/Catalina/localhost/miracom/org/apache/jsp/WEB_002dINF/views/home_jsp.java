/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2018-07-11 07:25:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("  <head>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\" \n");
      out.write("    integrity=\"sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt\" \n");
      out.write("    crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    <title></title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("   \t<h1>홈 페 이 지</h1><br>\n");
      out.write("    <img src=resources/bono.jpg width=\"20%\" height=\"20%\" class=\"fa-spin\"><br>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("      username : <input type=text id=id><br>\n");
      out.write("      pwd : <input type=password id=pwd><br>\n");
      out.write("      <button id=login>login</button>\n");
      out.write("\n");
      out.write("      <div>\n");
      out.write("        오늘의 날씨(서울)<br>\n");
      out.write("        <table border=1>\n");
      out.write("          <tr>\n");
      out.write("            <td> 날씨 </td>\n");
      out.write("            <td><span id=weather></span></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> 온도 </td>\n");
      out.write("            <td><span id=temp></span></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> 습도 </td>\n");
      out.write("            <td><span id=humidity></span></td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("         오늘의 날씨(해외) <br>\n");
      out.write("         <table border=\"1\">\n");
      out.write("            <tbody><tr>\n");
      out.write("               <td> 날씨 </td>\n");
      out.write("               <td>  <span id=\"weather2\"></span>   </td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("               <td> 온도 </td>\n");
      out.write("               <td>  <span id=\"temp2\"></span>   </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> 습도 </td>  <td>  <span id=\"humidity2\"></span>   </td>\n");
      out.write("            </tr>\n");
      out.write("         </tbody></table>\n");
      out.write("      </div>\n");
      out.write("      <a href=registerform>회원가입</a>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function displayWeather(lat, lon, weather, temp, humidity){\n");
      out.write(" var url = \"http://api.openweathermap.org/data/2.5/weather?lat=\" + lat + \"&lon=\" + lon + \"&APPID=342bd9672f19bbc63b63ec3b629cb610\";\n");
      out.write("    $.ajax({\n");
      out.write("    url:url,\n");
      out.write("    success:function(data){\n");
      out.write("      $(weather).html(data.weather[0].description);\n");
      out.write("      $(temp).html(data.main.temp);\n");
      out.write("      $(humidity).html(data.main.humidity);\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("  $(document).ready(function() {\n");
      out.write("    displayWeather(32, 20, \"#weather\", \"#temp\", \"#humidity\");\n");
      out.write("    displayWeather(52, 40, \"#weather2\", \"#temp2\", \"#humidity2\")\n");
      out.write("\t \n");
      out.write("\t   $(\"#login\").click( function() {\n");
      out.write("\t\t   var id = $('#id').val();\n");
      out.write("\t\t   var pwd = $('#pwd').val();\n");
      out.write("\t\t   var http = \"login.do?id=\" + id + \"&pwd=\" + pwd;\n");
      out.write("\t\t   // 여기선 login.jsp가아니라 login.do로 해야된다\n");
      out.write("\t\t   console.log(http);\n");
      out.write("\t\t   $.ajax({\n");
      out.write("\t            url: http,\n");
      out.write("\t            dataType:'json',\n");
      out.write("\t            error: function(data) {\n");
      out.write("\t            \talert(\"ERROR\");\n");
      out.write("\t            }, // 이거 브라우저에서는 되는데 컴파일러는 안됨 ㅠㅠ\n");
      out.write("\t            success:function(data){\n");
      out.write("\t            \tif ( data.msg == \"ok\")\n");
      out.write("\t            \t\talert(\"OK\"),\n");
      out.write("\t            \t\tlocation.href = \"/miracom/service.do\";\n");
      out.write("\t            \telse {\n");
      out.write("\t            \t\talert('id/pwd 확인');\n");
      out.write("\t            \t\t$('#id').val(\"\");\n");
      out.write("\t            \t\t$('#pwd').val(\"\");\n");
      out.write("\t            \t\t$('#id').focus();\n");
      out.write("\t            \t}\n");
      out.write("\t            }\n");
      out.write("\t       });\n");
      out.write("\t   });\n");
      out.write("   });\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
