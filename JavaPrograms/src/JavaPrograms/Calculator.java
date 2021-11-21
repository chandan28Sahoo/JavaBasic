package JavaPrograms;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	int a,b,c; // global
	public void addition(){
		System.out.println("give 2 input for addition");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println(c);
	}
	
	public void subtraction(){
		System.out.println("give 2 input for subtraction");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a - b;
		System.out.println(c);
	}
	
	public void mutiplication(){
		System.out.println("give 2 input for multiplecation");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a * b;
		System.out.println(c);
	}
	
	public void division(){
		System.out.println("give 2 input for division");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a / b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ab = new Calculator();
		ab.addition();
		ab.subtraction();
		ab.mutiplication();
		ab.division();
	}

}
