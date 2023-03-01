package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float minibal=2000f;
	final private float withdrawAmount=5000f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	public void withdraw(float accBal) {
		
		System.out.println("Account no: "+this.getAccNo()+" "
	+"Account name: "+this.getAccNm()+" "
				+"Account balance: "+this.getAccBal()+" "+"Minimum balance: "+minibal);
		System.out.println("withdraw ammount: "+withdrawAmount);
		System.out.println("Account balance is: "+(accBal-withdrawAmount));
		
	}

}
