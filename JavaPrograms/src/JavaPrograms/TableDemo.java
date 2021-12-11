package JavaPrograms;

import java.util.Scanner;

public class TableDemo {

	public void anyTable(int num) {
		for (int i = 1; i<= 10; i++) {
			System.out.println(num + " x " + i +" = "+ (num*i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to get the table :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		TableDemo ob = new TableDemo();
		ob.anyTable(input);
		sc.close();
	}

}
