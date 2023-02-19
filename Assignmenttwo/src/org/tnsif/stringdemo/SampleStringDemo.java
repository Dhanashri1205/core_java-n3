package org.tnsif.stringdemo;
import java.util.Scanner;

//to demonstrate an example on string creation
public class SampleStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//using string literal
		System.out.println("Enter first string: ");
		String str1=sc.nextLine();
		System.out.println("First string is: "+str1);
		
		//using new keyword
		System.out.println("Enter second string: ");
		String str2=new String(sc.nextLine());
		System.out.println("Second string is: "+str2);
		
		if(str1.equals(str2))
			System.out.println("Same");
		else
			System.out.println("Different");
		
		//using character array
		char c[]= {'H','A','P','P','Y'};
		String str3=new String(c);
		System.out.println(str3);
		
		
		
				
		

	}

}
