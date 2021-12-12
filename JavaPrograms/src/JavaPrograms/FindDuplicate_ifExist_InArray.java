package JavaPrograms;

import java.util.Scanner;

public class FindDuplicate_ifExist_InArray {

	public boolean checkChar(char arr[], char ab) {
		boolean flag = false;
		for(int j=0; j<=arr.length -1; j++) {
			if(arr[j] == ab) {
				System.err.print("char exist :");
				flag = true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDuplicate_ifExist_InArray ob = new FindDuplicate_ifExist_InArray();
		Scanner sc = new Scanner(System.in);
		char arr[] = new char[10];
		for(int i=0; i<= arr.length -1; i++ ) {
			System.out.println("Enter your char  :");
			char ab = sc.next().charAt(0);
			boolean check =  ob.checkChar(arr, ab);
			
			if(!check) {
				arr[i] = ab;
			}else {
				i = i - 1;
			}
		}
		for(int j=0; j<=arr.length -1; j++) {
			System.out.println(arr[j]);
		}
	}

}
