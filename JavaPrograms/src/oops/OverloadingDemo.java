package oops;
//polymorphism - when one work in java in many different way/form then it is called polymorphism 
/*
2 types
1. function overloading(compile time) - means create mulitple methode of same name in one class.
2. function overriding(run time)
 * */

class Students{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
}
public class OverloadingDemo extends Students
{
	public void trainsearch(int trainname)
	{
		System.out.println("shalimar");
	}
	public void trainsearch(String trainname)
	{
		System.out.println(trainname);
	}
	public void trainsearch(String stationto, String stationfrom)
	{
		System.out.println("jammu tavi");
	}
	
	public static void main(String[] args) {
		OverloadingDemo ob = new OverloadingDemo();
		ob.trainsearch(1234);
		ob.printInfo(25);
		ob.printInfo("jfkdlsfjlk",25);
		ob.printInfo("fjkdsjkl");
	}
}