package studentLinkedlist;
import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
	
		StudentLinkedList list = new StudentLinkedList();
		/*
		 * Student s = new Student("abc",123,24.'f');
		 * list.insertAtEnd(s);
		 * */
		Student student[]=new Student[2];
		for(int i=0;i<student.length;i++) {
			Student s= getStudentData(sc);
			list.insertAtEnd(s);
		}
		

		list.display();
		
		
	}

	private static Student getStudentData(Scanner sc) {
			System.out.println("\nenter name");
			String name=sc.next();
			System.out.println("\nenter roll no.");
			int rollno=sc.nextInt();
			System.out.println("\nenter age");
			int age=sc.nextInt();		
			System.out.println("\nenter gender");
			char gender=sc.next().charAt(0);
			Student s = new Student(name, age, rollno, gender);
		return s;
	}

}
