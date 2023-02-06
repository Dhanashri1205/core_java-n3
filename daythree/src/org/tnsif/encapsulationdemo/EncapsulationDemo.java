package org.tnsif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin : ");
		
		HDFC h=new HDFC();
		h.setPin(sc.nextInt());
		h.accept();

	}

}
