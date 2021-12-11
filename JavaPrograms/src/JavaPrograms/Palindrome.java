package JavaPrograms;

import java.util.Scanner;

public class Palindrome {
	public static boolean checkPalindrome(String str) {
		if(str.length() <= 2) {
			return false;
		}
		char []arr = str.toCharArray();
		int len = arr.length - 1;
		String abc = "";
		for (int i = len; i >= 0; i--) {
			abc+=arr[i];
		}
		if(str.equals(abc)) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome ob = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to check palindrome or not ");
		String str = sc.next();
		boolean x = ob.checkPalindrome(str);
		if(x) {
			System.out.println(str + " ,  is a palindrome");
		}else {
			System.out.println(str + " ,  is not a palindrome");
		}
		
	}

}
