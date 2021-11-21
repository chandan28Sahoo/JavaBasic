package JavaPrograms;

import java.util.Scanner;

public class MarkSheet_Demo {
	
	public float calculateMarks(float total) {
		float percentage =  (total / 600)* 100;
		return percentage;
	}
	
	public void markSheet(String name, String fatherName, int rollNum, 
			String collegeName, float Hindi, float English, float Physics,float Math, float chemistry,float Computer) {
		MarkSheet_Demo ob = new MarkSheet_Demo();
		System.out.println("******Mark Sheet**********");
		System.out.println("name : "+name);
		System.out.println("fatherName : "+fatherName);
		System.out.println("rollNum : "+rollNum);
		System.out.println("collegeName : "+collegeName);
		System.out.println("subjects----------- marks");
		System.out.println();
		System.out.println("1. Hindi           "+Hindi);
		System.out.println("2. English         "+English);
		System.out.println("3. Physics         "+Physics);
		System.out.println("4. Math            "+Math);
		System.out.println("5. chemistry       "+ chemistry);
		System.out.println("6. Computer        "+ Computer);
		float total =  Hindi + English + Physics +  Math + chemistry + Computer;
		float percentage = ob.calculateMarks(total);

		System.out.println("_______________________________");
		System.out.println("Total Number is -   " + total + "  percentage is -   " + percentage);
		System.out.println("_______________________________");
	}
	
	public void student_details() {
		MarkSheet_Demo ob = new MarkSheet_Demo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name = sc.nextLine();

		System.out.println("Enter your father Name ");
		String fatherName = sc.nextLine();
		
		System.out.println("Enter your roll number ");
		int rollNum = sc.nextInt();
		
		System.out.println("Enter your college name ");
		String collegeName = sc.next();
		
		System.out.println("Enter  marks ");

		System.out.println("Hindi - ");
		float Hindi = sc.nextFloat();

		System.out.println("English -");
		float English = sc.nextFloat();
		
		System.out.println("Physics -");
		float Physics = sc.nextFloat();
		
		System.out.println("Math -");
		float Math = sc.nextFloat();
		
		System.out.println("Chemistry -");
		float chemistry = sc.nextFloat();
		
		System.out.println("Computer -");
		float Computer = sc.nextFloat();
		ob.markSheet(name, fatherName, rollNum, collegeName, Hindi, English, Physics, Math, chemistry, Computer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkSheet_Demo ob = new MarkSheet_Demo();
		ob.student_details();
	}

}
