package com.mt.objecttracking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PdtBoxInfoCheck {

	public static int save(PdtBoxInfo p){
		int status=0;
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("insert into QCMT_PdtBoxInfo(parentitem,boxnumber,boxqty,orderqty,amtofusage,noofboxes,boxesleft,boxesback) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,p.getparentitem());
			ps.setString(2,p.getboxnumber());
			ps.setString(3, p.getboxqty());
			ps.setString(4,p.getorderqty());
			ps.setString(5,p.getamtofusage());
			ps.setString(6, p.getnoofboxes());
			ps.setString(7, p.getboxesleft());
			ps.setString(8, p.getboxesback());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(PdtBoxInfo p){
		int status=0;
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("update QCMT_PdtBoxInfo set parentitem=?, boxnumber=?,boxqty=?,orderqty=?,amtofusage=?,noofboxes=?,boxesleft=?,boxesback=? where parentitem=?");
			ps.setString(1,p.getparentitem());
			ps.setString(2,p.getboxnumber());
			ps.setString(3,p.getboxqty());
			ps.setString(4,p.getorderqty());
			ps.setString(5,p.getamtofusage());
			ps.setString(6, p.getnoofboxes());
			ps.setString(7, p.getboxesleft());
			ps.setString(8, p.getboxesback());
			ps.setString(9, p.getparentitem());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	/*public static int update1(PdtBoxInfo p){
		int status=0;
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("update QCMT_PdtBoxInfo set parentitem=?, boxnumber=?,boxqty=?,orderqty=?,amtofusage=?,noofboxes=?,boxesleft=?,boxesback=? where boxnumber=?");
			ps.setString(1,p.getparentitem());
			ps.setString(2,p.getboxnumber());
			ps.setString(3,p.getboxqty());
			ps.setString(4,p.getorderqty());
			ps.setString(5,p.getamtofusage());
			ps.setString(6, p.getnoofboxes());
			ps.setString(7, p.getboxesleft());
			ps.setString(8, p.getboxesback());
			ps.setString(9, p.getboxnumber());
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}*/
	public static List<PdtBoxInfo> view(){
		List<PdtBoxInfo> list=new ArrayList<PdtBoxInfo>();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_PdtBoxInfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				PdtBoxInfo p=new PdtBoxInfo();
				p.setparentitem(rs.getString("parentitem"));
				p.setboxnumber(rs.getString("boxnumber"));
				p.setboxqty(rs.getString("boxqty"));
				p.setorderqty(rs.getString("orderqty"));
				p.setamtofusage(rs.getString("amtofusage"));
				p.setnoofboxes(rs.getString("noofboxes"));
				p.setboxesleft(rs.getString("boxesleft"));
				p.setboxesback(rs.getString("boxesback"));
				
				list.add(p);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static PdtBoxInfo getPdtBoxinfoByparentitem(String parentitem){
		PdtBoxInfo p=new PdtBoxInfo();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_PdtBoxInfo where parentitem=?");
			ps.setString(1,parentitem);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				p.setparentitem(rs.getString("parentitem"));
				p.setboxnumber(rs.getString("boxnumber"));
				p.setboxqty(rs.getString("boxqty"));
				p.setorderqty(rs.getString("orderqty"));
				p.setamtofusage(rs.getString("amtofusage"));
				p.setnoofboxes(rs.getString("noofboxes"));
				p.setboxesleft(rs.getString("boxesleft"));
				p.setboxesback(rs.getString("boxesback"));
				
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return p;
	}
	
	public static PdtBoxInfo getPdtBoxinfoByboxnumber(String boxnumber){
		PdtBoxInfo p=new PdtBoxInfo();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_PdtBoxInfo where boxnumber=?");
			ps.setString(1,boxnumber);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				
				p.setboxnumber(rs.getString("boxnumber"));
				p.setboxesback(rs.getString("boxesback"));
				
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return p;
	}
	public static List<PdtBoxInfo> due(){
		List<PdtBoxInfo> list=new ArrayList<PdtBoxInfo>();
		try{
			Connection con=QCMemberCheck.getCon();
			PreparedStatement ps=con.prepareStatement("select * from QCMT_PdtBoxInfo where boxqty =0");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				PdtBoxInfo p=new PdtBoxInfo();
				p.setparentitem(rs.getString("parentitem"));
				p.setboxnumber(rs.getString("boxnumber"));
				p.setboxqty(rs.getString("boxqty"));
				p.setorderqty(rs.getString("orderqty"));
				p.setamtofusage(rs.getString("amtofusage"));
				p.setnoofboxes(rs.getString("noofboxes"));
				p.setboxesleft(rs.getString("boxesleft"));
				
				list.add(p);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static PdtBoxInfo getPdtBoxinfoByboxnumber1(String boxnumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
