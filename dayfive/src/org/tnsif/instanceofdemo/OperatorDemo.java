package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name address and age");
		String name=sc.nextLine();
		String address=sc.nextLine();
	
		int age=sc.nextInt();
		Child c=new Child();
		Child c1=new Child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		c1.setName(name);
		System.out.println(c1);
		System.out.println(c1 instanceof Person);
		System.out.println(c1 instanceof Child);

	}

}
