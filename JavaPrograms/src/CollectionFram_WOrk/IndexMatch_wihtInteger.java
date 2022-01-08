package CollectionFram_WOrk;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexMatch_wihtInteger {

	public static void compareList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for(int i = 0; i<list1.size(); i++) {
			if(list1.get(i) == (list2.get(i))) {
				System.out.println("match");
			}else {
				System.out.println("not match");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("please enter number 1 by 1 for list 1 to compare :");
		for(int i = 0; i<3; i++) {
			int input = sc.nextInt();
			list1.add(input);
		}

		System.out.println("please enter number 1 by 1 for list 2 to match :");
		for(int i = 0; i<3; i++) {
			int input = sc.nextInt();
			list2.add(input);
		}
		compareList(list1,list2);
	}

}
