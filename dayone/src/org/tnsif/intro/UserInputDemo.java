package org.tnsif.intro;
import java.util.Scanner;


public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value");
	    
		int x=sc.nextInt();
		System.out.println("Enter the float value");
		float y=sc.nextFloat();
		System.out.println("Enter the character value");
		char z=sc.next().charAt(0);
		System.out.println("Enter the double value");
		double d=sc.nextDouble();
		//System.out.println("Enter the string value");
		//String name=sc.next();
		//String str=sc.nextLine();
		
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
		System.out.println("Value of z : "+z);
		//System.out.println("Value of name : "+name);
		//System.out.println("Value of src : "+str);
		System.out.println("Value of d : "+d);

	}

}
