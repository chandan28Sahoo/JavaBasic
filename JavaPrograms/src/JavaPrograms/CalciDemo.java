package JavaPrograms;

import java.util.Scanner;

public class CalciDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		CalculatorServer obj=new CalculatorServer();
		obj.addition(a,b);
		
		obj.subtraction(a, b);
		
		obj.multiplication(a, b);
		
		obj.division(a, b);
	}

}
