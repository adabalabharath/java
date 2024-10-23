package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		Bank.greet();
		System.out.println("current balance is: "+Bank.currentBalance);
		bank.deposit(5000);
		System.out.println("deposit successful,current balance is: "+Bank.currentBalance);
		bank.withdraw(12500);
		System.out.println("withdrawal successful,current balance is: "+Bank.currentBalance);
		Bank.checkBalance();
		System.out.println("current balance is: "+Bank.currentBalance);
		
		int i=20;
		int k=i++ + ++i + i-- - --i;
		System.out.println(k);
		

	}

}
