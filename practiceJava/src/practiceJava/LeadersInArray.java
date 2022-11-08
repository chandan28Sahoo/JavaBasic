package practiceJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class LeadersInArray {

	
   public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {

        for (int i = 0; i < alist.size() / 2; i++) {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }
 
        return alist;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int A[] = {16,17,4,3,5,2};
		int max = -1;
		int last = n - 1;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = last; i>=0; i--) {
			if(A[i] >= max) {
				max = A[i];
				ans.add(max);
			}
		}
		
		LeadersInArray.reverseArrayList(ans);
		for (Integer integer : ans) {
			System.out.println(integer);
		}
		

	}

}
