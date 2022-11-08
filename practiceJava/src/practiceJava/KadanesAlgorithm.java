package practiceJava;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int arr[] = {-3,-5};
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		System.out.println(maxSum);
		for(int i = 0; i<n; i++) {
			currentSum += arr[i];
			if(currentSum > maxSum) {
				maxSum = currentSum;
			}
			
			else if(currentSum < 0) {
				currentSum = 0;
			}
		}

			System.out.println(maxSum);
	}

}
