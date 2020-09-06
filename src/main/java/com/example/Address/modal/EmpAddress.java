package com.example.Address.modal;

public class EmpAddress {

	int id; 
	String address;
	String mob;
	
	public EmpAddress () {}
	
	public EmpAddress(int id, String address , String mob) {
		this.id=id; this.address=address; this.mob=mob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	
}
