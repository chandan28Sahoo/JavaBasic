package multiThreading;

import java.util.Scanner;

public class PatternWithMultiThread {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int second = sc.nextInt();
		try {
			int x = first / second;
			System.out.println(x);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}

//public class Counter extends Thread {
//
//	@Override
//	public void run() {
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i + " Running Thread No:" + i);
////			try {
////				Thread.sleep(1000);
////			} catch (InterruptedException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//		}
//	}
//
//	public static void main(String args[]) {
//		Counter c1 = new Counter();
//		c1.start();
//		for (int i = 0; i <= 3; i++) {
//			System.out.println(i + " Running Thread No:" + "chandan");
//		}
//	}
//
//}
