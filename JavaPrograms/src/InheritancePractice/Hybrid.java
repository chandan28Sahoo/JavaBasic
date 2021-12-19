package InheritancePractice;


class a{
	String name;
	public void info() {
		System.out.println("a");
	}
}

class b extends a {
	public void info2(String name) {
		System.out.println(name);
	}
}

class c extends a {
	public void info3(String name) {
		System.out.println(name);
	}
}

class d extends c{
	public void info4(String name) {
		System.out.println(name);
	}
}


public class Hybrid extends d
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybrid ob = new Hybrid();
		ob.info();
		ob.info3("fjdklf");
		ob.info4("chandan");
		b ob2 = new b();
		ob2.info2("akash");
		
		
	}

}
