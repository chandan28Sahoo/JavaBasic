package string;

public class Stringdemoo 
{
	public static void main(String[] args)
	{
		

		String s="Hello";
		String s1="Hello";
		String s2= new String("Hello");
		String s3=new String("Hello");

		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(s2.equals(s3));
		
	}
}