package oops;

class Chandandemoo
{
	final public void getdata()
	{
		System.out.println("Hello getdata from chandan demo");
	}
}
public class FinalMethoddemo
{

	public void getdata()
	{
		System.out.println("Hello getdata from final method demo");
	}
	
	public static void main(String[] args) 
	{
		FinalMethoddemo ob = new FinalMethoddemo();
		ob.getdata();
	}
}