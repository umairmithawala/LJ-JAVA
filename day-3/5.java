/*

    Objective : Passing argu to method
    Author : Umair
    Date : 14-02-22

*/
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