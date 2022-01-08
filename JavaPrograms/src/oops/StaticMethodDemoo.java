package oops;

class Rajveerdemo
{
	static int a=30;
	public static void getdata()
	{
		System.out.println("Hello static method "+a);
	}
}
public class StaticMethodDemoo 
{
	
	public static void main(String[] args) 
	{
		Rajveerdemo.getdata();
	}
}