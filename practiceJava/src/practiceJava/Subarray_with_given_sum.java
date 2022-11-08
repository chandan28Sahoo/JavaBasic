package practiceJava;

public class Subarray_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; int s = 12;
		int arr[] = {1,2,3,7,5};
		int start = 0;
		int end = 0;
		long currentSum = 0;
		for(int i = 0; i<n; i++) {
			while(currentSum > s && start < i - 1) {
				currentSum -= arr[start];
				start++;
			}
//			System.out.println(currentSum);
			if(currentSum == s) {
				System.out.println((start+1));
				System.out.println((i));
				break;
			}
			else if(i < n) {
				currentSum += arr[i];
			}
		}
	}

}
