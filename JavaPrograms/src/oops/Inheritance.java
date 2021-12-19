package oops;

//Inheritance: 1. single level 
//2. multi level = one base to one derived class and this derived(base) class to one derived class  > derived class > derived class 
//3. hierarchial = one base and multiple derived class. base -> derived class -> derived class
//pass property once class to another class;
//parent
class shape{ // base class / parent class
	String color;

}
//derived class (circle is derived class of shape)
class circle extends shape{ // sub class / child class // circle is a derived class
//	triangle class taking property of shape

}
//multi level:  derived class (triangle is derived class of shape)
class triangle extends shape{ // sub class / child class
//	triangle class taking property of shape
	public void printColor() {
		System.out.println(this.color);
	}
}

//derived class (equilateral is derived class of triangle)
class equilateral extends triangle{ // sub class / child class
//	triangle class taking property of shape
	public void printColor() {
		System.out.println(this.color);
	}
}	

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t1 = new triangle();
		equilateral t2 = new equilateral();
		t1.color = "red";
		t1.printColor();
		t2.color = "red";
		t2.printColor();
	}

}
