// passing argu to the method
// addition of two number

class Test {

	void add(int a, int b)//arguments
	{
		int ans = a+b;
		System.out.println("Ans is "+ans);
	}

	public static void main (String args[]){

		Test obj1 = new Test();	// passing argument

		obj1.add(2,3);

	}

}