package org.tnsif.stringdemo;
//program to demonstrate on string comparison
public class StringComarisonDemo {

	public static void main(String[] args) {
		//creating a string using literal
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating a string using new operator
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
		//using compareTo
		System.out.println(s1.compareTo("tnsif"));//T-t=-32
		System.out.println(s3.compareToIgnoreCase("tnsif"));



	}

}
