package oops;
import java.util.*;
import banks.Bank;
/*
Object
Class
Inheritance
Polymorphism
Abstraction
Encapsulation

Coupling
Cohesion
Association
Aggregation
Composition


Object:
Any entity that has state and behavior is known as an object.
For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.

An Object can be defined as an instance of a class. 
An object contains an address and takes up some space in memory. 
Objects can communicate without knowing the details of each other's data or code. 
The only necessary thing is the type of message accepted and the type of response returned by the objects.

Class
Collection of objects is called class. It is a logical entity.

A class can also be defined as a blueprint from which you can create an individual object.
Class doesn't consume any space.

Inheritance:
When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. 
It provides code reusability. It is used to achieve runtime polymorphism.

Polymorphism:

if one task is performed in different ways, it is known as polymorphism. 
For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.

In Java, we use method overloading and method overriding to achieve polymorphism.

Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc.
1. function  overloading(compile time)
2. overridding(runtime)


* */

class pen {
	String color;
	String type;
	
	public void write() {
		System.out.println("write somthing");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}


class student{
	String name;
	int age;

	
//	student(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
	//	Polymorphism (function overloading) same method use multiple time for different work
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
}


//Inheritance: 1. single level 
//2. multi level = one base to one derived class and this derived(base) class to one derived class  > derived class > derived class 
//3. hierarchial = one base and multiple derived class. base -> derived class -> derived class
// pass property once class to another class;
// parent
class shape{

	public void area() {
		System.out.println("displayed area");
	}
}
//derived class (circle is derived class of shape)
class circle extends shape{
//	triangle class taking property of shape
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}
// multi level:  derived class (triangle is derived class of shape)
class triangle extends shape{
//	triangle class taking property of shape
	public void area(int l, int h) {
		System.out.println((1/2)*l*h);
	}
}

// derived class (equilateral is derived class of triangle)
class equilateral extends triangle{
//	triangle class taking property of shape
	public void area(int l, int h) {
		System.out.println((1/2)*l*h);
	}
}
public class Oops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		pen pen1 = new pen(); // constructor
				pen1.write();
				pen1.color = "blue";
				pen1.type = "gel";
				
				pen1.printColor();
				
				pen pen2 = new pen();
				pen2.color = "black";
				pen2.type = "bollpen";
				pen2.printColor();
				
				******
				 * 		student s1 = new student(); //constructor
				s1.name = "chandan";
				s1.age = 20;
				s1.printInfo(s1.name);
				s1.printInfo(s1.age);
				s1.printInfo(s1.name,s1.age);
				
						triangle t1 = new triangle();
				t1.area(5,6);
		 * */
		banks.Bank bn = new Bank(); 
		
	}

}
