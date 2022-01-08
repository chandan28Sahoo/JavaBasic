package oops;

public class FinalVariable_demo
{

	final int a=20;
	public void getdata()
	{
//		a=20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		FinalVariable_demo ob = new FinalVariable_demo();
		ob.getdata();
	}
}