package JavaPrograms;

import java.time.LocalDate;
import java.util.Scanner;

public class Get_day_from_month {

	public int return_day(int month) {
		LocalDate date = LocalDate.of(2021, month, 1);
		int days = date.lengthOfMonth();
		return days;
	}
	public void dayForMonth(String months) {
		Get_day_from_month ob = new Get_day_from_month();
		String month = months.toLowerCase();
		if(month.equals("january")) {
			int day = ob.return_day(1);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("february")) {
			int day = ob.return_day(2);
			System.out.println("it is "+ day +" Days");
//			System.out.println("it is 28 Days");
		}
		else if(month.equals("march")) {
			int day = ob.return_day(3);
			System.out.println("it is "+ day +" Days");
//			System.out.println("it is 31 Days");
		}
		else if(month.equals("april")) {
			int day = ob.return_day(4);
			System.out.println("it is "+ day +" Days");
//			System.out.println("it is 30 Days");
		}
		else if(month.equals("may")) {
			int day = ob.return_day(5);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("june")) {
			int day = ob.return_day(6);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("july")) {
			int day = ob.return_day(7);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("august")) {
			int day = ob.return_day(8);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("september")) {
			int day = ob.return_day(9);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("october")) {
			int day = ob.return_day(10);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("november")) {
			int day = ob.return_day(11);
			System.out.println("it is "+ day +" Days");
		}
		else if(month.equals("december")) {
			int day = ob.return_day(12);
			System.out.println("it is "+ day +" Days");
		}else {
			System.out.println("it not exist!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a month :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Get_day_from_month ob = new Get_day_from_month();
		ob.dayForMonth(input);
	}
}
