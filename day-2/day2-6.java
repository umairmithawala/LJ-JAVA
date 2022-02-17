//import scanner librery
import java.util.Scanner;

class Student{

	int id;
	String name = new String();
	int sem;

	// create function for code consume
	void getDetails()
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Id : ");
     	id = sc.nextInt();

     	System.out.print("Enter Name : ");
     	name = sc.next();

     	System.out.print("Enter Sem : ");
     	sem = sc.nextInt();

	}

	public static void main(String[] args) {
			
		Student s1 = new  Student();

		//call function
		s1.getDetails();

		System.out.println("Student id is : "+s1.id);
		System.out.println("Student Name is: "+s1.name);
		System.out.println("Student Sem is : "+s1.sem);

	}

}