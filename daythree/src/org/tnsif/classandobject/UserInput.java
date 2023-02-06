package org.tnsif.classandobject;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int speed=sc.nextInt();
		Car c=new Car();
		c.display(speed);
		

	}

}
