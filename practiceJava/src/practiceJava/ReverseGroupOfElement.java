package practiceJava;

public class ReverseGroupOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; int k = 3;
		int arr[] = {1,2,3,4,5};
		
		for(int i = 0; i<n; i+=k) {
			int end = i+k-1; //9
			if(end >= n) {
				end = n-1; // n - 1 = 5 - 1 = 4
			}
			int start = i;
			int temp = 0;
			while(start<end) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		for(int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]);	
		}
	}

}
