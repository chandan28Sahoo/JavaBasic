package JavaPrograms;

import java.util.Scanner;

public class SwitchCase_calsidemo {
	int a,b,c; // global
	public void addition(int a, int b){
		c = a + b;
		System.out.println("addition of 2 number is :" + c);
	}
	
	public void subtraction(int a, int b){
		c = a - b;
		System.out.println("subtraction of this 2 number is :" + c);
	}
	
	public void mutiplication(int a, int b){
		c = a * b;
		System.out.println("mutiplication of this 2 number is :"+c);
	}
	
	public void division(int a, int b){
		c = a / b;
		System.out.println( "division of this 2 number is :"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase_calsidemo ab = new SwitchCase_calsidemo();
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
		switch(c) {
			case 1:{
				ab.addition(a,b);
				break;
			}
			case 2:{
				ab.subtraction(a,b);
				break;
			}
			case 3:{
				ab.mutiplication(a,b);
				break;
			}
			case 4: {
				ab.division(a,b);
				break;
			}
			default:{
				System.out.println("input not valid!!!");
			}
		}
	}

}
