package oops;

public class TestInterface {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HDFCBank h =new HDFCBank();
		
		h.cashWidrawal();
		h.cashDeposit();
		h.carLoan();
		h.homeLoan();
		h.loan();
		h.educationLoan();
		
		//Dynamic polymorphism
		System.out.println("-------Dynamic polymorphism--------");
		USBank u =new HDFCBank();
		u.cashDeposit();
		u.cashWidrawal();
		u.loan();
		

	}

}
