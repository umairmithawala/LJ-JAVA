class Student3{
	int id;
	String name = new String();
	int age;
	

	static int count=0;
	
	// Initializer block
	{
		count++;
	}


	public static void totalObjects(){

		System.out.println("Total objects created : "+count);

	}


	public static void main(String args[]){
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		Student3 s3 = new Student3();

		totalObjects();
		
	}
}