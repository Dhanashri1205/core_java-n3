package org.tnsif.abstractiondemo;

abstract public class Menu {
	//abstract method
		abstract void recipe();
		abstract void foodType();
		//concrete method
		void menuType()
		{
			System.out.println("Veg and Nonveg");
		}

}
