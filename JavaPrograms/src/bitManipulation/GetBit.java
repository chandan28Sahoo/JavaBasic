package bitManipulation;

public class GetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; // 0101
		int position = 2;
		int bitMask = 1<<position;
		if((bitMask & n) == 0) {
			System.out.println("bit was zero");
		}else {
			System.out.println("bit was one");
		}
	}

}
