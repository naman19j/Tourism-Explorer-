package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        body{margin:125px 150px 250px 400px ;\n");
      out.write("    background-image: url('https://wallpaperaccess.com/full/1506250.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;}\n");
      out.write("    \n");
      out.write("    .div1\n");
      out.write("    {\n");
      out.write("        text-align: center;\n");
      out.write("        background-color: skyblue;\n");
      out.write("        opacity: .5;\n");
      out.write("        width:30%;\n");
      out.write("        height:150%;\n");
      out.write("        float:left\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .div2\n");
      out.write("    {\n");
      out.write("        text-align: center;\n");
      out.write("        background-color: lightblue;\n");
      out.write("        opacity: .8;\n");
      out.write("        width:40%;\n");
      out.write("        height:100%;\n");
      out.write("        float:left\n");
      out.write("    }\n");
      out.write("    .container\n");
      out.write("    {\n");
      out.write("        width:100%;\n");
      out.write("    }\n");
      out.write("    .button {\n");
      out.write("display: inline-block;\n");
      out.write("border-radius: 4px;\n");
      out.write("background-color: brown;\n");
      out.write("border: none;\n");
      out.write("color: #FFFFFF;\n");
      out.write("text-align: center;\n");
      out.write("font-size: 20px;\n");
      out.write("padding: 20px;\n");
      out.write("width: 140px;\n");
      out.write("transition: all 0.5s;\n");
      out.write("cursor: pointer;\n");
      out.write("margin: 5px;\n");
      out.write("height: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span {\n");
      out.write("cursor: pointer;\n");
      out.write("display: inline-block;\n");
      out.write("position: relative;\n");
      out.write("transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button span:after {\n");
      out.write("content: '\\00bb';\n");
      out.write("position: absolute;\n");
      out.write("opacity: 0;\n");
      out.write("top: 0;\n");
      out.write("right: -20px;\n");
      out.write("transition: 0.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span {\n");
      out.write("padding-right: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:hover span:after {\n");
      out.write("opacity: 1;\n");
      out.write("right: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("    height: 6%;\n");
      out.write("    border: 1px solid rgb(10, 10, 10);\n");
      out.write("    border-radius: 4px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("input[type=password] {\n");
      out.write("    height: 6%;\n");
      out.write("    border: 1px solid rgb(7, 7, 7);\n");
      out.write("    border-radius: 4px;\n");
      out.write("  }\n");
      out.write("  input[type=email] {\n");
      out.write("    height: 6%;\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-radius: 4px;\n");
      out.write("  }\n");
      out.write("  h4{\n");
      out.write("      font-family: Monaco;\n");
      out.write("      font-size: 15.5;\n");
      out.write("      font-weight: bolder;\n");
      out.write("  }\n");
      out.write("h1{\n");
      out.write("    text-decoration: wavy;\n");
      out.write("    color: aliceblue;\n");
      out.write("    text-shadow: black;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;SignUp Form</h1>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"div1\">\n");
      out.write("            <br><br><br>\n");
      out.write("            <h4><b>FIRST NAME<br><br>LAST NAME<br><br>EMAIL<br><br>PASSWORD<br><br>CONFIRM PASSWORD</b><h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"div2\">\n");
      out.write("            <br><br><br><br>\n");
      out.write("            <input type=\"text\" name = \"fname\" id = \"fname\" placeholder=\"Enter First Name\"><br><br>\n");
      out.write("        <input type=\"text\" name = \"lname\" id = \"lname\" placeholder=\"Enter Last Name \"><br><br>\n");
      out.write("        <input type=\"email\" name = \"email\" id = \"email\" placeholder=\"Enter Email\"><br><br>\n");
      out.write("        <input type=\"password\" name = \"pass\" id = \"pass\" placeholder=\"Enter Password\"><br><br>\n");
      out.write("            <input type=\"password\" name = \"passcfrm\" id = \"passcfrm\" placeholder=\"Re-enter Password\"><br><br>\n");
      out.write("            <button type = \"submit\" class=\"button\"><span>SUBMIT</span></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
