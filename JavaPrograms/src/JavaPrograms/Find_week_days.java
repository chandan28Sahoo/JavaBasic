package JavaPrograms;

import java.util.Scanner;

public class Find_week_days {

	public void weekInfo(String days) {
		String day = days.toLowerCase();
		if(day.equals("sunday")) {
			System.out.println("sunday is a holiday");
		}
		else if(day.equals("monday")) {
			System.out.println("it is a first day of heavy");
		}
		else if(day.equals("tuesday")) {
			System.out.println("it is a second day of heavy");
		}
		else if(day.equals("wednesday")) {
			System.out.println("it is a third day of heavy");
		}
		else if(day.equals("thursday")) {
			System.out.println("it is a fourth day of heavy");
		}
		else if(day.equals("friday")) {
			System.out.println("it is a fifth day of heavy");
		}
		else if(day.equals("saturday")) {
			System.out.println("it is a sixth day of heavy");
		}else {
			System.out.println("it not exist!!!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a day :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Find_week_days ob = new Find_week_days();
		ob.weekInfo(input);
	}
}
