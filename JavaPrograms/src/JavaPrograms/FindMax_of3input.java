package JavaPrograms;

import java.util.Scanner;

public class FindMax_of3input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		if(a > b) {
			if(a > c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b > c) {
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println(max);
		
	}

}
