package oops;

interface Animals{ // we can make contractor of interface
	int leg = 10;
	 void walk(); // this is called abstract function
}

interface harbivore{
	
}
class Horse implements Animals, harbivore {

	public void walk() {
		 System.out.println("animal walk with legs of " + leg);
	}
}
public class Interfaces { // pure abstraction

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals h = new Horse();
		h.walk();
	}

}
