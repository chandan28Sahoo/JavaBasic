package practiceJava;

import java.util.HashMap;
import java.util.Map;

public class Element_occurKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; int k = 1;
		int arr[] = {3,1,2};
		Map<Integer, Integer> map = new HashMap<>();
		
		int ans = 0;
		for(int i = 0; i<n; i++) {
		   if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if(map.get(arr[i])==k){
                    ans= arr[i];
                    System.out.println(ans);
                    break;
                }
		   }else {
			   map.put(arr[i],1); 
               if(map.get(arr[i])==k){
                   ans= arr[i];
                   System.out.println(ans);
                   break;
               }
		   }
		}
//		if(ans > 0) {
//			return ans;
//		}
//		return -1;
//		System.out.println(duplicates);
		
	}

}
