package oops;

class VijayDemooo
{
	public void getdata()
	{
		System.out.println("Hello getdata from Vijay Demo");
	}
}
public class SuperMethodDemo extends VijayDemooo
{
	public void getdata()
	{
		super.getdata();
		System.out.println("Hello getdata from Supermethod");
	}
	
	public static void main(String[] args) {
		SuperMethodDemo ob = new SuperMethodDemo();
		ob.getdata();
	}
}