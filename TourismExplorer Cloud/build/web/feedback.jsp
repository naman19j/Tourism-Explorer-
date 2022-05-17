<%-- 
    Document   : feedback
    Created on : 16 Jan, 2022, 6:48:48 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%
    String s1 = request.getParameter("name");
    String s2 = request.getParameter("email");
    String s3=request.getParameter("views");
  try {
    java.sql.Connection con;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "Kshitiz@06");
    Statement stmt=con.createStatement();
    stmt.executeUpdate("INSERT into feedback values('"+s1+"','"+s2+"','"+s3+"')");

    out.println("<html><script>"
            + "alert('Your feedback has been submitted successfully!');"
            + "</script></html>");
    RequestDispatcher req=request.getRequestDispatcher("index.jsp");
    req.include(request, response);
  }
  catch(SQLException e) {
    out.println("SQLException caught: " +e.getMessage());
  }
%>
