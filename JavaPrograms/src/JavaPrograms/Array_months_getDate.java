package JavaPrograms;

import java.util.Scanner;

public class Array_months_getDate {
	public static Scanner sc = new Scanner(System.in);
	public static void dayOfMonths(int size) {
		System.out.println("enter months for get day :");
		String [] arr = new String[size];
		for (int i = 0; i<= size - 1; i++) {
			arr[i] = sc.next();
		}
		SwitchCase_getDayOfMonth obs = new SwitchCase_getDayOfMonth();
		obs.dayForMonth(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array : ");
		int size = sc.nextInt();
		Array_months_getDate ob = new Array_months_getDate();
		ob.dayOfMonths(size);
	}

}
