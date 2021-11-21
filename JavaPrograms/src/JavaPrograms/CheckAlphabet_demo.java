package JavaPrograms;

import java.util.Scanner;

public class CheckAlphabet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a charcter to check vowel or consonant");
		
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		
		if(input == 'a' || input == 'e' ||  input == 'i' || input == 'o' || input == 'u') {
			System.out.println("vowel");
		}
		else if(input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}

}
