package oops;

class SuperDummy
{
	public SuperDummy(int a) 
	{
		System.out.println("super dummy constructor "+a);
	}
}
public class SuperConstructorDemoo extends SuperDummy
{
	public SuperConstructorDemoo() 
	{
		super(20);
		System.out.println("super constructor demo");
	}
	
	public static void main(String[] args) 
	{
		SuperConstructorDemoo ob = new SuperConstructorDemoo();
		
	}
	
}
