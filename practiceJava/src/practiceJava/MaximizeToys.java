package practiceJava;
import java.util.Arrays;   
public class MaximizeToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7; 
		int K = 50;
		int arr[] = {1, 12, 5, 111, 200, 1000, 10};
		Arrays.sort(arr);
		int totalCount = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] <= K) {
				K-= arr[i];
				totalCount++;
				System.out.println(arr[i]);
			}else {
				break;
			}
		}
		
		System.out.println("+++++++++++++++");
		System.out.println(totalCount);
	}

}
