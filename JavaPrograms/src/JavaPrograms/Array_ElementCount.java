package JavaPrograms;
import java.util.*;

public class Array_ElementCount {

	public void countString(String keypad[]) {
		List<String> list = new ArrayList<String>();
		
		for (int i=0; i<= keypad.length - 1; i++) {
			String abc = keypad[i];
			if(list.size() <= 0) {
				list.add(abc);
			}else {
				for (int j = 0; j<=list.size() -1 ; j++) {
					if(!list.contains(abc)) {
						list.add(abc);
					}
				}
			}
		}

		for (int j = 0; j<= list.size() -1; j++) {
			int count = 0;
			for (int i = 0; i<= keypad.length - 1; i++) {
				if(list.get(j).equals(keypad[i])) {
					count++;
				}
			}
			System.out.println(list.get(j)+" is "+ count + " times");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_ElementCount ob = new Array_ElementCount();
		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the brand names of mobile :");
		for (int i = 0; i<= arr.length - 1; i++) {
			arr[i] =  sc.next();
		}
		ob.countString(arr);
		sc.close();
	}

}
