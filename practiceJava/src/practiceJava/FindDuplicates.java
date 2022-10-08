package practiceJava;
import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrt [] = {2,3,2,3,4,5};
		System.out.println("duplicate number is : " + find_duplicates(arrt));
	}
	
//	public static int find_duplicates(int[] arr) {
//		int findN = 0;
//		for(int i = 0; i<= arr.length - 1; i++) {
//			for(int j = i + 1; j<=arr.length - 1; j++) {
//				if(arr[i] == arr[j]) {
//					//find duplicate
//					findN = arr[i];
////					return findN;
//				}
//			}
//		}
//		System.out.println(findN);
//		return findN;
//	}

	
	public static int find_duplicates(int[] arr) {
		int findN = 0;
		for(int i = 0; i<= arr.length - 1; i++) {
			int index = Math.abs(arr[i]) - 1;
			System.out.println("index : " + index);
			if(arr[index] < 0) {
				findN =  Math.abs(arr[i]);
				System.out.println(findN);
				return findN;
			}
			arr[index] = -arr[index];
 		}
		
		return -1;
	}
}
