package JavaPrograms;

import java.util.Scanner;

public class CheckWord_inString {

	public static String reverceWord(String word) {
		char []arr = word.toCharArray();
		int len = arr.length - 1;
		String abc = "";
		for (int i = len; i >= 0; i--) {
			abc+=arr[i];
		}
		return abc;
	}
	public String checkWord(String sentence, String str) {
		String [] splitArray = sentence.split(" ");
		String word = "";
		for (int ele = 0; ele<=splitArray.length - 1; ele++) {		
			if(splitArray[ele].equals(str)) {
				word = reverceWord(splitArray[ele]);
			}
		}
		if(word.length() > 0) {
			return word;
		}else {
			return "not exist";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckWord_inString ob = new CheckWord_inString();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence :");
		String sentence = sc.nextLine();
		System.out.println("enter a word :");
		String str = sc.next();
		System.out.println(ob.checkWord(sentence,str));
	}

}
