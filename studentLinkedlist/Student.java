package studentLinkedlist;
import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	int age;
	char gender;
	static String std="cdac";

	Student(String n, int a, int r, char g) {
		name = n;
		age = a;
		rollno = r;
		gender = g;
	}


	/*
	 * void populate_me_from_user_input() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter Student Name :"); name = sc.nextLine();
	 * 
	 * System.out.println("Enter Student Age :"); age = sc.nextInt();
	 * 
	 * System.out.println("Enter Student RollNo :"); rollno = sc.nextInt();
	 * 
	 * System.out.println("Enter Student Gender :"); gender = sc.next().charAt(0);
	 * 
	 * }
	 */
/*
	public boolean isFemale() {
		if (this.gender == 'F' || this.gender == 'f') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMale() {
		if (this.gender == 'M' || this.gender == 'm') {
			return true;
		} else {
			return false;
		}
	}

	
	public boolean isElder(Student sham) {
		if (this.age>sham.age) {
			return true;
		} else {
			return false;
		}
	}
*/	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", gender=" + gender + "]\n";
	}


}


/*
 * void print_me() { System.out.println("Name : " + name);
 * System.out.println("Age : " + age); System.out.println("Gender : " + gender);
 * System.out.println("Rollno : " + rollno); }
 */
