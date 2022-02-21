import java.util.*;
abstract class Emp{
	int id;
	String name;
	int age;

	Scanner sc = new Scanner(System.in);
	
	Emp(){
		id = 0;
		name = "xyz";
		age = 0;
		System.out.println("Inside Emp");
	}
	Emp(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	void getDetails(){
		
		System.out.println("Enter Details of Employee");
		System.out.print("id : ");
		id = sc.nextInt();
		System.out.print("name : ");
		name = sc.next();
		System.out.print("age : ");
		age = sc.nextInt();
	}
	void showDetails(){
		System.out.println("-------------------------------------------");
		System.out.println("id : "+ id + " name : " + name + " age : "+ age);
	}
}

class PartTimeEmp extends Emp{
	int numberOfHours;
	int ratePerHour;

	PartTimeEmp(){
		numberOfHours = 0;
		ratePerHour = 0;
		System.out.println("Inside the partime");
	}

	PartTimeEmp(int i, String n, int a, int nof, int rph){
		super(i, n, a);
		numberOfHours = nof;
		ratePerHour = rph;
	}

	void getDetails(){
		super.getDetails();

		System.out.print("Number of Hours : ");
		numberOfHours = sc.nextInt();
		System.out.print("Rate per Hour : ");
		ratePerHour = sc.nextInt();
	}

	void showDetails(){
		super.showDetails();
		System.out.println(" numberOfHours : "+numberOfHours +" rate/hour : "+ratePerHour);
		System.out.println("-------------------------------------------");
	}
}

class FullTimeEmp extends Emp{

	int basicPay;
	int da;

	FullTimeEmp(){
		basicPay = 0;
		da = 0;
		System.out.println("Inside the fulltime");
	}

	FullTimeEmp(int i, String n, int a, int basic, int d){
		super(i, n, a);
		basicPay = basic;
		da = d;
	}

	void getDetails(){
		super.getDetails();
		
		System.out.print("Basic Pay : ");
		basicPay = sc.nextInt();
		System.out.print("DA : ");
		da = sc.nextInt();
	}

	void showDetails(){
		super.showDetails();
		System.out.println(" basic : " +basicPay+" da : " + da);
		System.out.println("-------------------------------------------");
	}	
}


class Test{
	public static void main(String s[]){

		PartTimeEmp p1 = new PartTimeEmp(1,"abc",21,8,2500);

		FullTimeEmp f1 = new FullTimeEmp(2,"xyz",35,33000, 2500);

		p1.getDetails();
		p1.showDetails();

		f1.getDetails();
		f1.showDetails();

	}
}
