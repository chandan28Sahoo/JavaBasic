package practiceJava;
import java.util.ArrayList;


public class Maximumofallsubarraysofsizek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9; int k = 3;
		int arr[] = {1,2,3,1,4,5,2,3,6};
		// Deque<Integer> deque = new ArrayDeque<Integer>();  
		// ArrayList<Integer> ans = new ArrayList<Integer>(); 
		// for(int i = 0; i<n; i++) {
		// 	while(!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) {
		// 		deque.removeLast();
		// 	}
		// 	deque.addLast(i);
			
		// }
		// for(int i = 0; i<n; i++) {
		// 	ans.add(arr[deque.getFirst()]);
		// 	// System.out.println(arr[deque.getFirst()]);
		// 	while(!deque.isEmpty() && deque.getFirst() <= i - k) {
		// 		deque.removeFirst();
		// 	}

		// 	while(!deque.isEmpty() && arr[i] >= arr[deque.getLast()]) {
		// 		deque.removeLast();
		// 	}
		// 	deque.addLast(i);
		// 	System.out.println(arr[deque.getFirst()]);
		// }
		// ans.add(arr[deque.getFirst()]);

		ArrayList<Integer> arList = new ArrayList<>();
		int maxSub=0;
		int i=0,j=0;
		int count =0;
		
		
		while(i<=n-k)
		{
			if(count==k)
			{
				count=0;
				i++;
				j=i;
				arList.add(maxSub);
				maxSub =0;
			}
			else
			{
				count++;
				maxSub = Math.max(arr[j++],maxSub);
			}
		}
		
		for(int l = 0; l<arList.size(); l++){
			System.out.println(arList.get(l));
		}
	}
}
