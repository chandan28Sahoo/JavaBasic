package oops;


class pen{
	String color; 
	String type;
	public void write() {
		System.out.println("writting");
	}
	
	public void printOut() {
		System.out.println(this.color);
	}
}

class students{
	String name;
	int age;
	
	public void printINfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	students(){

	}
	students(students s2){
		this.name = s2.name;
		this.age = s2.age;
	}
}
public class BasicsOpps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pen ob = new pen();
		ob.write();
		ob.color = "blue";
		ob.type = "gel";
		
		pen ob2 = new pen();
		ob2.color = "black";
		ob2.type = "bolpen";
		
		ob.printOut();
		ob2.printOut();
		/*
			students student = new students("chandan",25);
		 */
		students student = new students();
		student.name = "chandan";
		student.age = 25;
			
		students s2 = new students(student);
		s2.printINfo();
		
	}

}
