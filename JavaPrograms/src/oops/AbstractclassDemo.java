package oops;

abstract class CarPolicy {
	public int carwheel() {
		return 4;
	}
	abstract public int price();

	abstract public String carcolour();
}

class Wagnor extends CarPolicy {
	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	@Override
	public String carcolour() {
		// TODO Auto-generated method stub
		return "white";
	}
}

class Santro extends CarPolicy {
	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 700000;
	}

	@Override
	public String carcolour() {
		// TODO Auto-generated method stub
		return "blue";
	}
}

public class AbstractclassDemo {
	public static void main(String[] args) {
		Wagnor ob = new Wagnor();
		System.out.println(ob.carcolour());
		System.out.println(ob.carwheel());
		System.out.println(ob.price());
	}
}