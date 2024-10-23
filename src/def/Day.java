package def;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] days={"monday","tuesday","wednesday","thursday","friday"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day");
        String day=sc.nextLine();
        boolean weekday=false;
        for(int i=0;i<days.length;i++) {
        	if(days[i].equals(day)) {
        		weekday=true;
        		System.out.println("uff its weekday");
        		break;
        	}
        }
        if(!weekday) {
        	System.out.println("yay,its weekend");
        }
	}

}
