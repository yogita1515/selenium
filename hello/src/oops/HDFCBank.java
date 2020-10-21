package oops;

public class HDFCBank implements USBank, UKBank{
	public void cashWidrawal()
	{
		System.out.println("USBank-----cashWidrawal");
	}
	
	public void cashDeposit() {
		System.out.println("USBank-----cashDeposit");
	}
	
	public void loan() {
		System.out.println("USBank-----loan");
	}
	
	public void carLoan() {
		System.out.println("HDFC-----cashLoan");
	}
	
	public void homeLoan() {
		System.out.println("HDFC-----homeLoan");
	}
	
	public void educationLoan() {
		System.out.println("UKBank----educationLoan");
	}


	
}
