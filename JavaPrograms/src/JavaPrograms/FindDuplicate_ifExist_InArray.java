package JavaPrograms;

import java.util.Scanner;

public class FindDuplicate_ifExist_InArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char arr[] = new char[10];
		for(int i=0; i<= arr.length -1; i++ ) {
			System.out.println("Please enter the char  :");
			char ab = sc.next().charAt(0);
			for(int j=0; j<=arr.length -1; j++) {
				if(arr[j] == ab) {
					System.err.println("char exist :");
				}else {
					arr[i] = ab;
				}
			}			
		}
		for(int ele = 0; ele<=arr.length -1; ele++) {
			System.out.println(arr[ele]);
		}
	}

}
