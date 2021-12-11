package JavaPrograms;

import java.util.Scanner;

public class Second_Maximum {
	public void print2ndMax(int arr[]) {
		int max = 0;
		int max2 = 0;
		for(int i = 0; i<=arr.length -1; i++) {
			if(arr[i] > max) {
				max2 = max;
				max = arr[i];
			}
			else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println(max2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_Maximum ob = new Second_Maximum();
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("the element to get 2 nd max :");
		for (int i = 0; i<= arr.length - 1; i++) {
			arr[i] =  sc.nextInt();
		}
		ob.print2ndMax(arr);
	}

}
