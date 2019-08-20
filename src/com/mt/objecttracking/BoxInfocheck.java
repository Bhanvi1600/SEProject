package com.mt.objecttracking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class BoxInfocheck {

	public static int save(BoxInfo b){
		int status=0;
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("insert into QCMT_BoxInfo(boxnumber,uniquecode,type,quantity) values(?,?,?,?)");
			ps.setString(1,b.getboxnumber());
			ps.setString(2,b.getuniquecode());
			ps.setString(3, b.gettype());
			ps.setString(4,b.getquantity());
			

			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(BoxInfo b){
		int status=0;
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("update QCMT_BoxInfo set boxnumber= ?,uniquecode=?,type=?,quantity=? where uniquecode=?");
			ps.setString(1,b.getboxnumber());
			ps.setString(2,b.getuniquecode());
			ps.setString(3,b.gettype());
			ps.setString(4,b.getquantity());
			
			ps.setString(5, b.getuniquecode());
			status=ps.executeUpdate();
			System.out.println(status);
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<BoxInfo> view(){
		List<BoxInfo> list=new ArrayList<BoxInfo>();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_BoxInfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BoxInfo b=new BoxInfo();
				b.setboxnumber(rs.getString("boxnumber"));
				b.setuniquecode(rs.getString("uniquecode"));
				b.settype(rs.getString("type"));
				b.setquantity(rs.getString("quantity"));
				
			
				list.add(b);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static BoxInfo getBoxInfoByboxnumber(String boxnumber){
		BoxInfo b=new BoxInfo();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_BoxInfo where boxnumber=?");
			ps.setString(1,boxnumber);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				b.setboxnumber(rs.getString("boxnumber"));
				b.setuniquecode(rs.getString("uniquecode"));
				b.settype(rs.getString("type"));
				
				b.setquantity(rs.getString("quantity"));
				
				
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return b;
	}
	public static List<BoxInfo> ll(){
		List<BoxInfo> list=new ArrayList<BoxInfo>();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_BoxInfo where quantity=1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BoxInfo b=new BoxInfo();
				
				b.setboxnumber(rs.getString("boxnumber"));
				b.setuniquecode(rs.getString("uniquecode"));
				b.settype(rs.getString("type"));
				
				b.setquantity(rs.getString("quantity"));
				
				
				list.add(b);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
}