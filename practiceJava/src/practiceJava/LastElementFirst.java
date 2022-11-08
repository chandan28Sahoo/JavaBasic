package practiceJava;

public class LastElementFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,2,3,4] = [4,1,2,3]
		int arr[] = {1,2,3,4,5};
		first_element_last(arr);
	}
	public static void first_element_last(int []arr) {
		int s = 0;
		for(int i = 0; i<arr.length; i++) {
			if(i == 0) {
				s = arr[i];
				arr[i] = arr[arr.length - 1];
			}else {
				int k = arr[i];
				arr[i] = s;
				s = k;
			}
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
