package com.studant;

public class Studant {

	private int id;
	private String name;
	private String address;
	private int mark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Studant [id=" + id + ", name=" + name + ", address=" + address + ", mark=" + mark + "]";
	}
	
	
	
	
}
