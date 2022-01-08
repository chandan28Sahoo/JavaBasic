package exceptionHandling;

public class ThrowsDemooo 
{

	public void getdata() throws InterruptedException,ArithmeticException
	{
		System.out.println("hello start getdata method");
		Thread.sleep(5000);
		System.out.println("Hello end getdata method");
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		ThrowsDemooo ob = new ThrowsDemooo();
		ob.getdata();
	}
}
