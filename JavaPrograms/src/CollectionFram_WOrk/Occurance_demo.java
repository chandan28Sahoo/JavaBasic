package CollectionFram_WOrk;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Occurance_demo {

	public static void countChar(String input) {
		LinkedHashSet<Character>hs1= new LinkedHashSet<Character>();
		int len = input.length();
		for(int i = 0; i<len; i++) {
			hs1.add(input.charAt(i));
		}
		
		for(char ele:hs1) {
			int count = 0;
			for(int i = 0; i<len; i++) {
				if(ele == input.charAt(i)) {
					count++;
				}
			}
			System.out.println( ele + " is " + count + " times");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		countChar(input);
	}

}
