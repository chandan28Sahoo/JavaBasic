package JavaPrograms;

import java.util.Scanner;

public class Reverse_string_ifLength_isOdd {

	public void reverseAndOut(String str) {
		char []arr = str.toCharArray();
		String out = "";
		int len = arr.length - 1;
		for (int i = len; i >= 0; i--) {
			out+=arr[i];
		}
		System.out.println(out);
	}
	public void checkLength_and_evenOrOdd(String sentence) {
		String [] splitArray = sentence.split(" ");
		for(int i=0; i<=splitArray.length-1; i++) {
			if(splitArray[i].length() % 2 != 0) {
				reverseAndOut(splitArray[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_string_ifLength_isOdd ob = new Reverse_string_ifLength_isOdd();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ob.checkLength_and_evenOrOdd(input);
	}

}
