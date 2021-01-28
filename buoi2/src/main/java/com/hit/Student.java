package com.hit;

public class Student {
	
	private int ID;
	private String Name;
	private String Email;
	private String Address;
	
	public Student() {
		
	}
	public Student(int ID, String Name, String Email, String Address)
	{
		this.ID = ID;
		this.Name=Name;
		this.Email=Email;
		this.Address=Address;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String Address() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address= Address;
	}
	
}
