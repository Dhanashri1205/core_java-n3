package org.tnsif.looping;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n=n1;
		int count=0;
		if(n==0)
			count=0;
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		System.out.println("Number of digits in "+n1+" is : "+count);

	}

}
