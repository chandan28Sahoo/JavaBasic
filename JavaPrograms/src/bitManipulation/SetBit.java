package bitManipulation;

public class SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // 0101
		int position = 1;
		int bitMask = 1<<position;
		int newNum = bitMask | n;
		System.out.println(newNum);
	}

}
