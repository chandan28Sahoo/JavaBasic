package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandlingdem
{

	
	public void getdata()
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic "+e);
			showdata();
		}
		catch(InputMismatchException e)
		{
			System.out.println("inputmismatch "+e);
			getdata();
		}
	}
	public void showdata()
	{
		System.out.println("hello showdata");
	}
	
	public static void main(String[] args)
	{
		Exceptionhandlingdem ob = new Exceptionhandlingdem();
		ob.getdata();
	
	}
}