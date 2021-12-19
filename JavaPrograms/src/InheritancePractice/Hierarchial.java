package InheritancePractice;

class shape{
	String name;

	public void area() {
		System.out.println("shape");
	}
}

class triangle extends shape{
	
	public void info(String name) {
		System.out.println(name);
	}
}

class circle extends shape{
	public void area(int r) {
		System.out.println((3.14) * r *r);
	}
}

public class Hierarchial extends circle
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial ob = new Hierarchial();
		ob.area();
		triangle ob2 = new triangle();
		ob2.info("fdsjh");
	}

}
