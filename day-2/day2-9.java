//import scanner librery
import java.util.Scanner;
class Stud2{

	int id;
	String name = new String();
	int sem;

	public static void main(String[] args) {
			
		Stud2 s1 = new  Stud2();
		Stud2 s2 = new  Stud2();
		Stud2 s3 = new  Stud2();

		
		//input value by user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id : ");
     	s1.id = sc.nextInt();
     	System.out.print("Enter Name : ");
     	s1.name = sc.next();

     	//output of user inputed value
		System.out.println("Student id is : "+s1.id);
		System.out.println("Student id Name : "+s1.name);

	}

}