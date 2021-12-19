package JavaPrograms;

import java.util.Scanner;

public class Reverse_String {

	public void string_reverse(String str) {
		int len = str.length() -1;
		System.out.println(len);
		String out = "";
		for(int i = len; i >= 0; i-- ) {
			out+=str.charAt(i);
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_String ob = new Reverse_String();
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ob.string_reverse(str);
	}
}
