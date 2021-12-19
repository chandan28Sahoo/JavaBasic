package InheritancePractice;

class parents{
	String name;
	int age;
	public void printInfo() {
		System.out.println("parent");
	}
	
}

class students extends parents{
	public void printInfo(int age) {
		System.out.println(age);
	}
}

public class SingleLevel
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students ob = new students();
		ob.printInfo();
		ob.printInfo(25);
	}

}
