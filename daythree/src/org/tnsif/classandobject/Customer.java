package org.tnsif.classandobject;
//to demonstrate a program on this keyword and constructor
public class Customer {
	//member variable
	private int id;
	private  String name;
	private String city;
	
	 //default constructor
	public Customer()
	{
		
	}
	//parameterize constructor
	public Customer(int id, String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	//getter and setter
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//method
	public void display()
	{
		System.out.println(id+" "+name+" "+city);
	}

}
