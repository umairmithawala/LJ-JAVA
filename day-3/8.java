/*

    Objective : call by refrence
    Author : Umair
    Date : 14-02-22

*/
class Test {

	int no;
	
	void fun(Test t) //passing argument

	{
		t.no++;
	}

	public static void main (String args[]){

		Test obj1 = new Test();
		Test obj2 = new Test();

		obj2.no=10;
		obj1.fun(obj2);

		System.out.println("Value obj.2 is : "+obj2.no); 

	}
	 
}