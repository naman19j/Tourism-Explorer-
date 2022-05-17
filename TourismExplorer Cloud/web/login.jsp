<%-- 
    Document   : login
    Created on : 16 Jan, 2022, 6:43:43 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%
    String s1 = request.getParameter("email");
    String s2 = request.getParameter("pass");
  try {
    java.sql.Connection con;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "Kshitiz@06");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from signup where email='"+s1+"' and pass='"+s2+"'");
    if(rs.next())
{
    response.sendRedirect("profilepage.html");
    
}
else
{
    out.println("<html><script>"
            + "alert('Invalid Credentials, please try again!');"
            + "</script></html>");
    response.sendRedirect("index.jsp");
}
  }
  catch(SQLException e) {
    out.println("SQLException caught: " +e.getMessage());
  }
%>
