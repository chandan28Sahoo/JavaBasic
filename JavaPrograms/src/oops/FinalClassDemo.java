package oops;

final class Chandandemo
{
	public void getdata()
	{
		System.out.println("Hello getdata");
	}
}
public class FinalClassDemo extends Chandandemoo
{
	public void showdata()
	{
		System.out.println("hello showdata");
	}
	public static void main(String[] args) {
		FinalClassDemo ob = new FinalClassDemo();
		ob.showdata();
		ob.getdata();
	}
}