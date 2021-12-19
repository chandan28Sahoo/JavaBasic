package oops;

abstract class Animal{
	abstract void walk();
	Animal(){
		System.out.println("it is a animal");
	}
}

class horse extends Animal {
	horse(){
		System.out.println("horse walk");
	}
	public void walk() {
		System.out.println("walk in 4 lags");
	}
}

class chicken extends Animal {
	public void walk() {
		System.out.println("walk in 2 lags");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		horse ob = new horse();
		ob.walk();
	}

}
