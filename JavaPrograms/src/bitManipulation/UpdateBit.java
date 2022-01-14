package bitManipulation;

import java.util.Scanner;

public class UpdateBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oper = sc.nextInt();
		// update bit to 1 or 0 
		int n = 5; // 0101

		if(oper == 1) {
			//set 
			int position = 1;
			int bitMask = 1<<position;
			int newNum = bitMask | n;
			System.out.println(newNum);
		}else if(oper == 2) {
			int position = 2;
			int bitMask = 1<<position;
			int notBit = ~(bitMask);
			int newNum = notBit & n;
			System.out.println(newNum);
		}
	}
}
