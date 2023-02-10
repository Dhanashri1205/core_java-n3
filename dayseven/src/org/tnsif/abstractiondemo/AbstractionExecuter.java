package org.tnsif.abstractiondemo;

public class AbstractionExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButterChicke b=new ButterChicke();
		/*We can't instantiate the abstract class*/
		//Menu m=new Menu();
		
		b.foodType();
		b.menuType();
		b.recipe();

	}

}
