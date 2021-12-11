package JavaPrograms;

import java.time.LocalDate;
import java.util.Scanner;

public class SwitchCase_getDayOfMonth {

	public int return_day(int month) {
		LocalDate date = LocalDate.of(2021, month, 1);
		int days = date.lengthOfMonth();
		return days;
	}
	public void dayForMonth(String arr[]) {
		int day;
		SwitchCase_getDayOfMonth ob = new SwitchCase_getDayOfMonth();
		for(int i = 0; i<= arr.length -1; i++) {
			String month = arr[i].toLowerCase();
			switch(month)
			{
				case "january":{
					day = ob.return_day(1);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "february": {
					day = ob.return_day(2);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "march": {
					day = ob.return_day(3);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "april": {
					day = ob.return_day(4);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "may": {
					day = ob.return_day(5);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "june": {
					day = ob.return_day(6);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "july": {
					day = ob.return_day(7);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "august": {
					day = ob.return_day(8);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "september": {
					day = ob.return_day(9);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "october": {
					day = ob.return_day(10);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "november": {
					day = ob.return_day(11);
					System.out.println("it is "+ day +" Days");
					break;
				}
				case "december": {
					day = ob.return_day(12);
					System.out.println("it is "+ day +" Days");
					break;
				}
				default:
				{
					System.out.println("it not exist!!!");
				}
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			System.out.println("enter a month :");
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			
			SwitchCase_getDayOfMonth ob = new SwitchCase_getDayOfMonth();
			ob.dayForMonth(input);
		*/
	}

}



