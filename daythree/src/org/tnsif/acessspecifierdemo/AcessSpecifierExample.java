package org.tnsif.acessspecifierdemo;

public class AcessSpecifierExample {
	//data members
	private String name="MET";
	/* if any data member is default it will
	 * acess only inside the same package
	 * */
	
	public void display() {
		System.out.println("Name is: "+name);
	}

	//getters and setters for private data members
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
