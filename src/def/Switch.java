package def;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		switch(num%2) {
		case (0):
			System.out.println("number is even");
		break;
		case (1):
			System.out.println("number is odd");
		break;
		default :
			System.out.println("invalid");
            break;
		}
		//sc.nextLine();
		System.out.println("enter a day");
		String day=sc.nextLine();
		switch(day) {
		case "sunday":
		case "saturday":
			System.out.println("yay, its weekend");
			break;
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("uff its weekday");
			break;
		default:
			System.out.println("enter valid day");
			break;
		}


	}

}
