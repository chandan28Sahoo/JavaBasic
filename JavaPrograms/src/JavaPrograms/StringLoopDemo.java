package JavaPrograms;

import java.util.Scanner;

public class StringLoopDemo {

	public void stringtable(String str) {
		for (int i = 1; i<= 10; i++) {
			System.out.println(str + " " + i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string to get the table :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringLoopDemo ob = new StringLoopDemo();
		ob.stringtable(input);
		sc.close();
	}

}
