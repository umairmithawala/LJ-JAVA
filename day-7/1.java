//------------- toString() & equals() method------------
class Student{
	int id;
	String name;
	int age;

	Student(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}

	public boolean equals(Student obj){
		if(this.id == obj.id && this.name == obj.name && this.age == obj.age) return true; //if i of both the object having same value then true
		else return false;
	}

	public String toString(){
		return "id : " + id +"\nname : "+name+"\nage : "+age;
	}
	
}

class Test{
	public static void main(String a[]){
		Student t1 = new Student(101, "aaa", 21);
		Student t2 = new Student(102, "bbb", 22);

		System.out.println(t1); 
		System.out.println(t2);   	  
		System.out.println("Both the objects are equal : "+t1.equals(t2)); 
	}
}
