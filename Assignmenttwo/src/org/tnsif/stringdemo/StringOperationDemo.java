package org.tnsif.stringdemo;
//program to demonstrate on different string operation
public class StringOperationDemo {

	public static void main(String[] args) {
		String s1=new String("Bhujabal");
		String s2=s1.toUpperCase();
		System.out.println("String 1: "+s1);
		System.out.println("String 2: "+s2);
		System.out.println("String length: "+s1.length());
		System.out.println("Substring: "+s1.substring(4,7));
		System.out.println("String empty : "+s1.isEmpty());

	}

}
