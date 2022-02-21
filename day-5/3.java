import java.util.*;
abstract class Emp{
	int id;
	String name;
	int age;
	int salary;

	Scanner sc = new Scanner(System.in);
	
	Emp(){
		id = 0;
		name = "xyz";
		age = 0;
		salary = 0;
		System.out.println("Inside Emp");
	}
	Emp(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}

	abstract void calcSalary(); // Abstract funtion

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
		System.out.println("id : "+ id + "\nname : " + name + "\nage : "+ age + "\nsalary : "+salary);
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

		this.calcSalary();
	}

	void showDetails(){
		super.showDetails();
		System.out.println("numberOfHours : "+numberOfHours +"\nrate/hour : "+ratePerHour);
		System.out.println("-------------------------------------------");
	}
	void calcSalary(){
		salary = numberOfHours * ratePerHour;
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

		this.calcSalary();
	}

	void showDetails(){
		super.showDetails();
		System.out.println("basic : " +basicPay+"\nda : " + da);
		System.out.println("-------------------------------------------");
	}	

	void calcSalary(){
		salary =(basicPay + da);
	}
}

class Test{
	public static void main(String s[]){
		Emp ref;
		PartTimeEmp p1 = new PartTimeEmp(1,"abc",21,10,2500);
		FullTimeEmp f1 = new FullTimeEmp(2,"xyz",35,28000, 2000);

		ref = p1;
		ref.getDetails();
		ref.showDetails();

		ref = f1;
		ref.getDetails();
		ref.showDetails();

	}
}