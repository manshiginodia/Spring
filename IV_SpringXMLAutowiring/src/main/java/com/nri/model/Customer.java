package com.nri.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int cid;
	private String cname;
	
	//to use autowire using annotations
	@Autowired
	private Address address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Address address) {
		super();
		this.address = address;
		System.out.println("Auto wiring of obj");
	}

	public Customer(int cid, String cname, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	

}
