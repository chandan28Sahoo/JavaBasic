package practiceJava;
import java.util.*;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*calculate the total from the array*/
		/*
			float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
			float sum = 0;
			for(float element:marks) {
				sum+=element;
			}
			System.out.println("total is : "+ sum);
		*/
		/*average*/
		/*
			float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
			float sum = 0;
			for(float element:marks) {
				sum+=element;
			}
			System.out.println("total is : "+ sum / marks.length);
		*/
		
		/*reverse array */
		/*
			int [] arr = {8,5,6,9,2,6,10,25,36};
			
			int l = arr.length;
			int n = l / 2 ;
	
			int temp;
			for (int i = 0; i<n; i++) {
				temp = arr[i];
				arr[i] = arr[l-i-1];
				arr[l-i-1] = temp;
			}
			for(int element:arr) {
				System.out.println(element);
			}
		*/
		/*find maximum number*/
		/*
			int [] arr = {9,2,6,25,36,10};
			int max = 0;  // Integer.MIN_VALUE
			for (int ele:arr ) {
				if(ele > max) {
					max = ele;
				}
	
			}
			System.out.println(max);
		*/
		/* take input and make an array. and find the index of element*/
		/*
			System.out.println("enter the size of array : ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int numbers [] = new int[size];
			
			for(int i = 0; i<size; i++) {
				numbers[i] = sc.nextInt();
			}
			
			System.out.println("enter the number to find in array :");
			int x = sc.nextInt();
			int index = 0;
			for(int i = 0; i<= numbers.length - 1; i++) {
				if(numbers[i] == x) {
					index = i;
				}
			}
			System.out.println("this is the index for the particular number : "+ index);
		*/
		
	}

}
