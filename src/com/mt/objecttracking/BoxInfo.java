package com.mt.objecttracking;

public class BoxInfo {
	
	private String boxnumber,type,uniquecode,quantity;
	
	public BoxInfo() {}
	public BoxInfo(String a,String b,String c,String d)
	{
		this.boxnumber=a;
		this.type=c;
		this.uniquecode=b;
		this.quantity=d;
		
	}
	
	public String getquantity()
	{
		return quantity;
	}
	
	public void setquantity(String quantity)
	{
		
		this.quantity=quantity;
	}
	
	public String getboxnumber()
	{
		return boxnumber;
	}
	
	public void setboxnumber(String boxnumber)
	{
		this.boxnumber=boxnumber;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public void settype(String type)
	{
		this.type=type;
	}
	
	public String getuniquecode()
	{
		return uniquecode;
	}
	
	
	public void setuniquecode(String uniquecode)
	{
		this.uniquecode=uniquecode;
	}
	
	
}
	
