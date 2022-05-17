<%-- 
    Document   : signup
    Created on : 16 Jan, 2022, 12:53:39 AM
    Author     : LENOVO
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String s1 = request.getParameter("fname");
    String s2 = request.getParameter("lname");
    String s3 = request.getParameter("email");
    String s4 = request.getParameter("pass");
  try {
    java.sql.Connection con;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "Kshitiz@06");
    Statement stmt=con.createStatement();
    stmt.executeUpdate("INSERT into signup values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
    response.sendRedirect("login.html");
  }
  catch(SQLException e) {
    out.println("SQLException caught: " +e.getMessage());
  }
%>