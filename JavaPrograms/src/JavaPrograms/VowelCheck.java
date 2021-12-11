package JavaPrograms;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter char for table:");
		char [] arr = new char[size];
		for (int i = 0; i<=size - 1; i++) {
			arr[i] = sc.next().charAt(0);
		}
		System.out.println();
		for (char input:arr ) {
			String s = Character.toString(input);
			String str = s.toLowerCase();
			
			switch(str)
			{
				case "a":{
					System.out.println("it is vowel");
					break;
				}
				case "e":{
					System.out.println("it is vowel");
					break;
				}
				case "i":{
					System.out.println("it is vowel");
					break;
				}
				case "o":{
					System.out.println("it is vowel");
					break;
				}
				case "u":{
					System.out.println("it is vowel");
					break;
				}
				default:
				{
					System.out.println("it is consonant!!!");
				}
			}
		}
	}

}
