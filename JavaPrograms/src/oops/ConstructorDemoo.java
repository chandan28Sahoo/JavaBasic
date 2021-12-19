package oops;

public class ConstructorDemoo {

	public ConstructorDemoo(int a)
	{
			System.out.println("default constructor "+a);
	}
	public void showdata()
	{
		System.out.println("Hello showdata ");
	}
	public static void main(String[] args) {
	
		ConstructorDemoo ob = new ConstructorDemoo(90);
		ob.showdata();
	}

}
