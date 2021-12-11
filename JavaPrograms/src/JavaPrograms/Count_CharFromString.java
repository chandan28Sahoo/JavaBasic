package JavaPrograms;

import java.util.Scanner;

public class Count_CharFromString {
	public static int count_char(String str, char chr) {
		char ch [] = str.toCharArray();
		int count = 0;
		for (int i = 0; i<= ch.length - 1; i++) {
			if(chr == ch[i]) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string :");
		String str = sc.next();
		System.out.println("enter a char :");
		char chr = sc.next().charAt(0);
		System.out.println(chr + "  in "+ str + " is "  +  count_char(str,chr)+ "  times");
	}

}
