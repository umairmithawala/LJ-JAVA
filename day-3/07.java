//local variable pass by value -- call_by_value
class Test {

	void fun(int no) //passing argument

	{
		no++;
	}

	public static void main (String args[]){

		Test obj1 = new Test();

		int a = 10;

		obj1.fun(a);

		System.out.println("Value of a is : "+a); 

	}
	 
}