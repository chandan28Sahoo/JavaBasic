package oops;

public class FinalizeDemooo 
{	
	public static void main(String[] args)
	{
		FinalizeDemooo ob = new FinalizeDemooo();
		System.out.println(ob.hashCode());
		ob=null;
		System.gc();
		System.out.println("destroy the memory end the clean process");
	
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("calling the finalize");
	}
}