package JavaPrograms;

import java.util.Scanner;

public class Amstrong_number {

	public void checkAmstrong(int num) {
		int out = 0;
		int temp = num;
//		int num2 = num;
//		int count = 0;
		String s=Integer.toString(num);
		int len = s.length();
		for(;num>0;) {
			int a=num%10;
			num=num/10;
//			count+=1;
			int b = 1;
			for(int i = 1; i<=len; i++) {
				b = b * a;
			}
			out+=b;
		}
	/*
		for(;num2>0;) {
			int a=num2%10;
			num2=num2/10;
			for(int i = 1; i<=count; i++) {
				b = b * a;
			}
			out+=b;
			b=1;
		}
	*/
		if(temp==out)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amstrong_number ob = new Amstrong_number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the num");
		int num = sc.nextInt();
		ob.checkAmstrong(num);
	}

}
