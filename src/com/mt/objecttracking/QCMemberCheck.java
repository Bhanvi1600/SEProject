package com.mt.objecttracking;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class QCMemberCheck {
	public static Connection getCon() throws Exception{
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			String url="jdbc:mysql://localhost:3306/mt";
			String username="root";
			
			 // @SuppressWarnings("unused")
			con=DriverManager.getConnection(url,username,"");
			//System.out.println("Connected");
			
		}catch(Exception e) {System.out.println(e);}
		return con;
	}
	public static boolean validate(String name,String password) {

	boolean status=false;
	try { Connection con=getCon();
	      PreparedStatement ps=con.prepareStatement("select * from QCMT_QCMember where name=? and password=?");
	      ps.setString(1,name);
	      ps.setString(2, password);
	      ResultSet rs=ps.executeQuery();
	      status=rs.next();
	      con.close();
	}catch(Exception e) {System.out.println(e);}
	return status;
}
	
public static int save(QCMember m) {
 int status=0;
	try {
		  Connection con=getCon();
		  PreparedStatement ps=con.prepareStatement("insert into QCMT_QCMember(name,password,email,contactno)values(?,?,?,?)");
		  ps.setString(1,m.getName());
		  ps.setString(2, m.getPassword());
		  ps.setString(3, m.getEmail());
		  ps.setString(4, m.getContactno());
		  status=ps.executeUpdate();
		  con.close();
	}catch(Exception e) {System.out.println(e);}
	return status;
}
public static List<QCMember>view(){
	List<QCMember>list=new ArrayList<>();
	try {
		  Connection con=getCon();
		  PreparedStatement ps=con.prepareStatement("select * from QCMT_QCMember");
		  ResultSet rs=ps.executeQuery();
		  while(rs.next()) {
			  QCMember m=new QCMember();
			  m.setId(rs.getString(1));
			  m.setName(rs.getString(2));
			  m.setPassword(rs.getString(3));
			  m.setEmail(rs.getString(4));
			  m.setContactno(rs.getString(4));
			  list.add(m);
		  }
		  con.close();
	}
	catch(Exception e) {System.out.println(e);}
	return list;

		} 
		  
}




