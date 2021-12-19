package InheritancePractice;

class parent{
	String name;
	int age;
	public void printInfo() {
		System.out.println("parent");
	}
	
}

class student extends parent{
	public void printInfo(int age) {
		System.out.println(age);
	}
}

class info extends student{
	public void printInfo(String name) {
		System.out.println(name);
	}
}

public class multiLavel extends info{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiLavel ob = new multiLavel();
		ob.printInfo();
		ob.printInfo(25);
		ob.printInfo("chandan");

	}

}
