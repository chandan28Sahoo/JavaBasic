package practiceJava;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 17;
		int arr[] = {2,0,2,0,0,1,2,2,2,1,1,0,1,1,1,2,0};
		int start = 0;
		int end = N -1;
		int temp = 0;
		int i = 0;
		while(i<end) {
			if(arr[i] == 0) {
				temp = arr[i];
				arr[i] = arr[start];
				arr[start] = temp;
				start++;
				i++;
			}
			else if(arr[i] == 2) {
				temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--;
//				i++;
			}else {
				i++;
			}
		}
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//				  int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//				}
//			}
//		}
		for(int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]);	
		}
	}

}
