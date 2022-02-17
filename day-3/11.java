class Student{

	int id;
	String name = new String();
	int age;

	Student(int i, String n, int a){

		id = i;
		name = n;
		age = a;

	}


	public static void maxAge(int age1,int age2){

		if (age1 > age2) {
			System.out.println("S1 is greater");
		}
		else {

			System.out.println("S2 is greater");
		}

	}


	public static void main(String[] args) {
		
		Student a1 = new Student(101,"abc",22);
		Student a2 = new Student(102,"xyz",2);

		maxAge(a1.age,a2.age);

	}


}