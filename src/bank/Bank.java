package bank;

public class Bank {
	
	static int currentBalance=6000;
	
	public static void greet() {
		System.out.println("Hello,welcome to banking");
	}
	
	public void deposit(int amount) {
		currentBalance+=amount;
	}
	
	public void withdraw(int amount) {
		if(amount<currentBalance) {
			currentBalance-=amount;
		}else {
			System.out.println("withdrawal amount is greater than currentBalance");
		}
	}
	
	public static int checkBalance() {
		return currentBalance;
	}

}
