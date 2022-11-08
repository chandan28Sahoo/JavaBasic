package practiceJava;

public class LongestCommonPrefix {
	
	public static String compareTwoString(String A, String B) {
		int i = 0;
		String pre = "";
		while(i < A.length()  && i <  B.length()) {
			if(A.charAt(i) == B.charAt(i)) {
				pre += A.charAt(i);
				i++;	
			}else {
				break;
			}
		}
		return pre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		String pre = arr[0];
		for(int i = 0; i<n-1; i++) {
			pre =  compareTwoString(pre,arr[i+1]);
		}
		System.out.println(pre);
	}

}
