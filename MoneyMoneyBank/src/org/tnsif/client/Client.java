package org.tnsif.client;
import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;
public class Client {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1234,"Dhanashri Sonawane",45000f,true);
		CurrentAcc c=new MMCurrentAcc(1234,"Neha Sonawane",55000f,2000f);
		System.out.println("Saving account: ");
		System.out.println(s);
		s.withdraw(s.getAccBal());
		
		System.out.println("\nCurrent account: ");
		System.out.println(c);
		c.withdraw(c.getAccBal());
		
		

	}

}
