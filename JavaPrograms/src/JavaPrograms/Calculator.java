package JavaPrograms;

import java.util.Scanner;

public class Calculator {
	
	
	int a,b,c; // global
	public void addition(int a, int b){
		c = a + b;
		System.out.println(c);
	}
	
	public void subtraction(int a, int b){
		c = a - b;
		System.out.println(c);
	}
	
	public void mutiplication(int a, int b){
		c = a * b;
		System.out.println(c);
	}
	
	public void division(int a, int b){
		c = a / b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ab = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!!!");
		System.out.println("give 2 input to see demo");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("choose the number to get reselt ");
		System.out.println("1 - addition ");
		System.out.println("2 -  subtraction");
		System.out.println("3 -  mutiplication");
		System.out.println("4 - division ");
		int c = sc.nextInt();
		if(c == 1) {
			ab.addition(a,b);
		}
		else if(c == 2) {
			ab.subtraction(a,b);
		}
		else if(c == 3) {
			ab.mutiplication(a,b);
		}
		else if(c == 4) {
			ab.division(a,b);
		}else {
			System.out.println("input not valid!!!");
		}
	}

}
