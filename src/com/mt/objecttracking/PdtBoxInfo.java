package com.mt.objecttracking;

public class PdtBoxInfo {
	
	@SuppressWarnings("unused")
	private String parentitem,boxnumber,boxqty,orderqty,amtofusage,noofboxes,boxesleft,boxesback;
	
	
	public PdtBoxInfo() {}
	public PdtBoxInfo(String a,String b,String c,String d,String e,String f,String g,String h) {
		this.parentitem=a;
		this.boxnumber=b;
		this.boxqty=c;
		this.orderqty=d;
		this.amtofusage=e;
		this.noofboxes=f;
		this.boxesleft=g;
		this.boxesback=h;
		
	}
	
	
	
	
	public String getparentitem()
	{
		return parentitem;}
	
	public void setparentitem(String parentitem)
	{
		this.parentitem=parentitem;
	}
	
	public String getboxnumber()
	{
		return boxnumber;
	}
	
	public void setboxnumber(String boxnumber) {
		this.boxnumber=boxnumber;
	}
	
	public String getamtofusage()
	{
		return amtofusage;
	}
	
	public void setamtofusage(String amtofusage) {
		this.amtofusage=amtofusage;
	}
	
	public String getorderqty()
	{
		return orderqty;}
	public void setorderqty(String orderqty)
	{
		this.orderqty=orderqty;
	}
	
	public String getboxqty()
	{ float s=Float.parseFloat(amtofusage);
	  float s1=Float.parseFloat(orderqty);
	  float s2=s*s1;
	  boxqty=Float.toString(s2);
	  return boxqty;
	}
	public void setboxqty(String boxqty)
	{this.boxqty=boxqty;
	}
	


	public String getnoofboxes()
	{
		return noofboxes;
	}
	

	public void setnoofboxes(String noofboxes) {
		this.noofboxes=noofboxes;
	}
	
	public String getboxesleft()
	{ float x=Float.parseFloat(noofboxes);
	  float y=Float.parseFloat(boxqty);
	float a=x-y;
	  boxesleft=Float.toString(a);
	  return boxesleft;
		
	}
	

	public void setboxesleft(String boxesleft) {
		this.boxesleft=boxesleft;
	}
	
	public String getboxesback()
	{
		return boxesback;
	}
	
	public void setboxesback(String boxesback) {
		this.boxesback=boxesback;
		
	}
	
}
	


