package JavaPrograms;

import java.util.Scanner;

public class ArrayTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter numbers for table:");
		int [] arr = new int[size];
		for (int i = 0; i<=size - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for (int ele:arr ) {
			for (int i = 1; i<= 10; i++) {
				System.out.println(ele + " x " + i +" = "+ (ele*i));
			}
		}
	}

}
