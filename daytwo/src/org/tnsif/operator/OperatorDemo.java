package org.tnsif.operator;
import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		//Arithmetic operator
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		System.out.println(x%y);
		
		//Relational operator
		boolean res=x>y;
		System.out.println(res);
		
		//Assignment operator
		x*=y;
		System.out.println(x);
		
		//Logical operator
		//
		//
		boolean res2=(5==5)&&(5>3);
		boolean res3=(5==3)||(5>2);
		boolean res4=!(5!=4);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		//Bitwise operator
		int a=12 & 5;
		int b=12 | 5;
		int c=12^5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//
		//Ternary operator
		String res5=(12%2==0)?"True":"False";
		System.out.println(res5);
		
		//Incerement and Decrement
		int p=x++;//5
		int q=--x;//5
		System.out.println(q);
		
		
		

	}

}
