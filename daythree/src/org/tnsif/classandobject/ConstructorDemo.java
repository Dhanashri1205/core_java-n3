package org.tnsif.classandobject;

import java.util.Scanner;

//Driver class
public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many customer you want to add\n Enter the number");
		//customer1
		
		int i=1;
		while(i<=sc.nextInt())
		{
			System.out.println("Enter the Id Name and City :");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.next();
			String city=sc.next();
			Customer c=new Customer(id,name,city);
			//c.display();
			System.out.println("Id: "+c.getId()+" \nName: "+c.getName()+" \nCity: "+c.getCity());
			System.out.println();
			i++;
		}
		
		/*//Customer2
		System.out.println("Enter the Id Name and City :");
		int id1=sc.nextInt();
		sc.nextLine();
		String name1=sc.next();
		String city1=sc.next();
		Customer c1=new Customer(id1,name1,city1);
		//c1.display();
		System.out.println("Id: "+c1.getId()+" Name: "+c1.getName()+" City: "+c1.getCity());
		*/
		

	}

}
