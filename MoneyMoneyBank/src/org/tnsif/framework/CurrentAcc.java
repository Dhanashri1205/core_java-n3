package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	final private float creditLimit;
	final private float withdrawAmount=3000f;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	public void withdraw(float accBal) {
		System.out.println("Account no: "+this.getAccNo()+" "
	+"Account name: "+this.getAccNm()+" "
				+"Account balance: "+this.getAccBal()+" "+"Credit limit: "+this.creditLimit);
		System.out.println("withdraw ammount: "+withdrawAmount);
		System.out.println("Account balance is: "+(accBal-withdrawAmount));
		
	}

}
