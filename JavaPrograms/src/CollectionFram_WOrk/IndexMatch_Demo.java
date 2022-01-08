package CollectionFram_WOrk;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexMatch_Demo {

	public static void compareList(ArrayList<String> list1, ArrayList<String> list2) {
		
		for(int i = 0; i<list1.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				System.out.println("match");
			}else {
				System.out.println("not match");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("please enter words 1 by 1 for list 1 to compare :");
		for(int i = 0; i<3; i++) {
			String input = sc.nextLine();
			list1.add(input);
		}

		System.out.println("please enter words 1 by 1 for list 2 to match :");
		for(int i = 0; i<3; i++) {
			String input = sc.nextLine();
			list2.add(input);
		}
		compareList(list1,list2);
	}

}
