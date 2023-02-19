package org.tnsif.stringdemo;
//program to demonstrate on StringB8uffer
public class StringBuffferDemo {

	public static void main(String[] args) {
		//length vs capacity
		StringBuffer sb=new StringBuffer("Dhanashri");
		System.out.println(sb);
		// 16 is by default + string length(9)
		System.out.println("Capacity: "+sb.capacity());//by default it is 16
		System.out.println("Length: "+sb.length());
		
		String str;
		int a=34;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println("Append: "+sb);//34
		System.out.println("Reverse: "+sb.reverse());//43



		


		

	}

}
