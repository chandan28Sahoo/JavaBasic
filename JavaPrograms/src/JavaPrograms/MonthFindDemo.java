package JavaPrograms;

import java.util.Scanner;

public class MonthFindDemo {

	public void monthInfo(String months) {
		String month = months.toLowerCase();
		if(month.equals("january")) {
			System.out.println("it is a first month");
		}
		else if(month.equals("february")) {
			System.out.println("it is a second month");
		}
		else if(month.equals("march")) {
			System.out.println("it is a third month");
		}
		else if(month.equals("april")) {
			System.out.println("it is a fourth month");
		}
		else if(month.equals("may")) {
			System.out.println("it is a fifth month");
		}
		else if(month.equals("june")) {
			System.out.println("it is a sixth month");
		}
		else if(month.equals("july")) {
			System.out.println("it is a seventh month");
		}
		else if(month.equals("august")) {
			System.out.println("it is a 8th month");
		}
		else if(month.equals("september")) {
			System.out.println("it is a 9th month");
		}
		else if(month.equals("october")) {
			System.out.println("it is a 10th month");
		}
		else if(month.equals("november")) {
			System.out.println("it is a 11th month");
		}
		else if(month.equals("december")) {
			System.out.println("it is a 12th month");
		}else {
			System.out.println("it not exist!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a month :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		MonthFindDemo ob = new MonthFindDemo();
		ob.monthInfo(input);
	}

}
