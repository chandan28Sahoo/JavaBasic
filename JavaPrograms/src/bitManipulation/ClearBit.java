package bitManipulation;

public class ClearBit {
	public static void main(String[] args) {
		int n = 5; // 0101
		int position = 2;
		int bitMask = 1<<position;
		int notBit = ~(bitMask);
		int newNum = notBit & n;
		System.out.println(newNum);
	}
}
