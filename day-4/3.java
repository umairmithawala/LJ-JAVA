class Student{

	int no;
	
	int add(int n1, int n2){
		return n1+n2;
	}
	float add(float f1, float f2){
		return f1+f2;
	}
	public static void main(String args[]){

		Student s1 = new Student();
		Student s2 = new Student();

		int ans = s1.add(5,10);
		float fl = s1.add(10.2f, 10.3f);		

		System.out.println(ans);
		System.out.println(fl);


	}
}
