class p1{

	int id;
	String name = new String();
	int sem;

	public static void main(String[] args) {
		
		//create obj of class	
		p1 s1 = new  p1();
		p1 s2 = new  p1();
		p1 s3 = new  p1();

		//store value in object variable
		s1.id = 1;
		s1.name = "xyz";		
		s1.sem = 2;

		//print value
		System.out.println("Id is : "+s1.id);
		System.out.println("name is : "+s1.name);
		System.out.println("sem is : "+s1.sem);

	}

}