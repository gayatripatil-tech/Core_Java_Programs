class BankTransaction
 {
	public static void main (String[] args)

	{
	String name="Ayush";
	double balance=5200.0;
	System.out.println("Name of Acholder is :"+ name);
	System.out.println(" Current Balance is :" + balance);

	double AmtWithdraw=850.0;
	balance-= AmtWithdraw;// logic 

	System.out.println(" Withdrawal amount :" + AmtWithdraw);// Amount withdrwal
	System.out.println(" Balance after Amount withdrawal :"+ balance);
	
	double Deposit=500.0;
	balance+=Deposit;// logic

	System.out.println("Deposit amount is :"+ Deposit);
	System.out.println("Balance after Deposit added:"+ balance);// balance after depoist is added
	}
}