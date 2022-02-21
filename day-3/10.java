/*

    Objective : local variable pass by value
    Author : Umair
    Date : 14-02-22

*/
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