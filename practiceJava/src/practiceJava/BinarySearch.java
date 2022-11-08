package practiceJava;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5} ;
		int k = 4;
		int n = 5;
		int left = 0;
		int right = n -1;
		while(left<=right) {
			int mid = (left+right) / 2;
			if(arr[mid] == k) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid] > k) {
				right = mid - 1;
			}else if(arr[mid] < k) {
				left = mid + 1;
			}
			
		}
	}

}
