package practiceJava;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5 ;
		int arr[] = {1,3,5,2,2} ;
		long left = 0;
		
		long sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		for(int j = 0; j<n; j++) {
			long right = sum - left - arr[j];
			if(left == right) {
//				return i+1;
				System.out.println(j+1);
			}
			left+=arr[j];
		}

	}

}
