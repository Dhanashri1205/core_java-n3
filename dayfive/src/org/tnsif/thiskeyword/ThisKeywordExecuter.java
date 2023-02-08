package org.tnsif.thiskeyword;
//this keyword in terms of method argument
public class ThisKeywordExecuter {
	void function1(ThisKeywordExecuter e)
	{
		System.out.println("Function 1 invoked");
	}
	void function2()
	{
		function1(this);
	}

	public static void main(String[] args) {
		ThisKeywordExecuter e=new ThisKeywordExecuter();
		e.function2();

	}

}
