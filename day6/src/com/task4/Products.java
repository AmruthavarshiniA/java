package com.task4;

public class Products {

	private int pid;
	private String pname;
	private int price;
	public Products(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [pid="+pid+",pname="+pname+",price="+price+"] ";
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
