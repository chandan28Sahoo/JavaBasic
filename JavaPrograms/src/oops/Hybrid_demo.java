package oops;

class ABC
{
	public void a()
	{
		System.out.println("hello a method from ABC class");
	}
}
class PQR extends ABC
{
	public void b()
	{
		System.out.println("hello b metyhod from PQR class");
	}
}
class XYZ extends ABC
{
	
	public void c()
	{
		System.out.println("Hello c method from XYZ class");
	}	
}
public class Hybrid_demo extends XYZ
{

	public void D()
	{
		System.out.println("hello d method from Hybrid class");
	}
	public static void main(String[] args) {
		Hybrid_demo ob = new Hybrid_demo();
		ob.D();
		ob.c();
		ob.a();
		XYZ ob1= new XYZ();
		ob1.a();
		ob1.c();
		PQR ob2= new PQR();
		ob2.a();
		ob2.b();
	}
}
