class Student{
	int id;
	String name = new String();
	int age;

	Student(int i, String nm, int ag){
		id=i;
		name = nm;
		age = ag;
	}

	Student highest(Student s1, Student s2){
		if(s1.age > s2.age){
			
			return s1;
		}	
		else{
			return s2;
		}
	}

	void getDetails(){
		System.out.println("----------------------------Student Details----------------------");
		System.out.println("stud id : "+id);
		System.out.println("stud name : "+name);
		System.out.println("stud age : "+age);
	}

	public static void main(String args[]){
		Student s1 = new Student(1,"abc",21);
		Student s2 = new Student(2,"pqr",30);
		Student s3 = new Student(3,"xyz",19);


		Student temp = s1.highest(s2, s3);

		temp.getDetails();

	}
}