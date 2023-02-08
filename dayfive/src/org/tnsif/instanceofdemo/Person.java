package org.tnsif.instanceofdemo;
//to demonstrate an example of instanceof operator
//parent class
public class Person {
	//data members
	private String name;
	private String address;
	
	//getter setter
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
	
	//constructors
	public Person() {
		
		System.out.println("Parent class");
		
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	

}
