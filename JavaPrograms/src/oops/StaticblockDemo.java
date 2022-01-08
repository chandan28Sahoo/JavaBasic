package oops;

public class StaticblockDemo
{

	public StaticblockDemo() 
	{
		System.out.println("hello constructor");
	}
	static
	{
		int a=20;
		System.out.println("Hello static block "+a);
	}
	public void showdata()
	{
		System.out.println("Hello showdata");
	}
	public static void main(String[] args) {
		StaticblockDemo ob = new StaticblockDemo();
		ob.showdata();
		
	}
}