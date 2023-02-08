package org.tnsif.superkeyword;
//Child class
public class Rose extends Flower {
	private String name;
	 public void display()
	 {
		 System.out.println(name);
		//it will call to parent class variable
		super.setName("Flower");
		System.out.println(super.getName());
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Rose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rose(String name) {
		super();
		this.name = name;
	}
	 

}
