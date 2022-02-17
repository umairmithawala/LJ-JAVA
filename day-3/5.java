// passing obj as argument

class Test {

	int no;

	void add(Test t1, Test t2){
		
		int ans = t1.no + t2.no;
		System.out.println(ans);

	}


	public static void main (String args[]){

		Test obj1 = new Test();
		Test obj2 = new Test();
		Test obj3 = new Test();


		obj1.no = 10;
		obj2.no = 10;

		obj3.add(obj1, obj2);

	}

}