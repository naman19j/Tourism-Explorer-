package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Home Page</title>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Homepage.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"topnav\">\n");
      out.write("        <a class=\"active\" href=\"index.jsp\">Home</a>\n");
      out.write("        <a href=\"login.html\">Login</a>\n");
      out.write("        <a href=\"signup.html\">SignUp</a>\n");
      out.write("        <a href=\"aboutus.html\" target=\"_blank\">Meet Our Team</a>\n");
      out.write("        <a href=\"feedback.html\" target=\"_blank\">Feedback</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <h4>\n");
      out.write("        <img style=\"border-radius:50%;width: 13%; border-style: dotted; border-color: seagreen;\"\n");
      out.write("            src=\"https://cdn5.vectorstock.com/i/1000x1000/70/64/icons-of-traveling-planning-vacation-tourism-vector-21917064.jpg\"\n");
      out.write("            alt=\"Travel Logo\">\n");
      out.write("    </h4>\n");
      out.write("\n");
      out.write("    <h1 style=\"text-align: center; color:black; font-family: Georgia;\">TOURISM EXPLORER</h1>\n");
      out.write("\n");
      out.write("    <div class=\"auto\" style=\"max-width:500px;\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://imgcld.yatra.com/ytimages/image/upload/t_yt_blog_w_800_c_fill_g_auto_q_auto:good_f_jpg/v1543910413/StatueofUnity1_1543908986.jpg\" style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://upload.wikimedia.org/wikipedia/commons/6/6d/Jal_Mahal_in_Man_Sagar_Lake.jpg\"style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://images.news18.com/ibnlive/uploads/2021/09/hawa-mahal-163266422316x9.jpg\" style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://qph.fs.quoracdn.net/main-qimg-add854c2cd376ab188a2dd7c1b2ea0d8\" style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://www.wallpapertip.com/wmimgs/87-877309_indian-historical-places-photo-indian-tourism-photo-chaturbhuj.jpg\" style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"http://eragenx.com/wp-content/uploads/2016/07/rajasthan.jpg\" style=\"width:100%\">\n");
      out.write("        <img class=\"slideshow\" src=\"https://wallpapercave.com/wp/wp2301598.jpg\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        var myIndex = 0;\n");
      out.write("        carousel();\n");
      out.write("\n");
      out.write("        function carousel() {\n");
      out.write("            var i;\n");
      out.write("            var x = document.getElementsByClassName(\"slideshow\");\n");
      out.write("            for (i = 0; i < x.length; i++) {\n");
      out.write("                x[i].style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            myIndex++;\n");
      out.write("            if (myIndex > x.length) { myIndex = 1 }\n");
      out.write("            x[myIndex - 1].style.display = \"block\";\n");
      out.write("            setTimeout(carousel, 2000);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <BR>\n");
      out.write("    <h2 style=\"text-align: center;font-family: Georgia;\">WHAT DO YOU WANT TO DO TODAY?</h2>\n");
      out.write("    <h3 style=\"font-family: Georgia;\">Tourism Explorer offers limitless opportunities for tourism and adventure.\n");
      out.write("        There is something for everyone - Pilgrimage, &nbsp;&nbsp;Temples, Wildlife tours, Bird Watching, Rafting,\n");
      out.write("        Mountaineering, Skiing,\n");
      out.write("        Trekking, Camping, Yoga and Meditation and much &nbsp;&nbsp;more.\n");
      out.write("        Register yourself to explore the tourism in India.</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p> &nbsp;Developer: Kshitiz Goyal&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;\n");
      out.write("            Contact Number: 9772056027&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            Email: kshitiz.goyal2019@vitstudent.ac.in&emsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            Location: Jaipur, Rajasthan, India</p>\n");
      out.write("        <p> &nbsp;Developer: Naman Jain&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            Contact Number: 9711554734&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("            Email: naman.jain2019a@vitstudent.ac.in&emsp;&emsp;\n");
      out.write("            Location: New Delhi, India</p>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
