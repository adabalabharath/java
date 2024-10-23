package def;

import java.util.Scanner;

public class Userinput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("what is ur name?");
		String name=sc.nextLine();
		System.out.printf("hey %s, how are u? \n",name);
		sc.nextLine();
		System.out.println("whats ur age?");
		int age=sc.nextInt();
		System.out.println("thanks for the information");
		
	}

}
