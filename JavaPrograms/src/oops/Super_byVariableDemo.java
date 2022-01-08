package oops;

class ChandenDemo
{
	int a=20;
}
public class Super_byVariableDemo extends ChandenDemo
{
	int a=30;
	public void showdata()
	{
		System.out.println(super.a);
	}
	public static void main(String[] args) 
	{
		Super_byVariableDemo ob = new Super_byVariableDemo();
		ob.showdata();
	}
}
