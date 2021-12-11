package JavaPrograms;

import java.util.Scanner;

public class Prime_number {

	public void checkPrime(int num) {
		boolean temp = true;
		for(int i=2;i<=num/2; i++) {
			if(num % i == 0) {
				temp = false;
				break;
			}
		}
		if(temp) {
			System.out.println("it is a prime number ");
		}else {
			System.out.println("it is not a prime number ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_number ob = new Prime_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the num");
		int num = sc.nextInt();
		ob.checkPrime(num);
	}

}
