/*

    Objective : Function Overloading
    Author : Umair
    Date : 14-02-22

*/

class Test {

	int add(int no1, int no2){

		int ans = no1 + no2;
		return ans;

	}

	float add(float no1, float no2){

	float ans = no1 + no2;
	return ans;

	}

	public static void main (String args[]) {


		Test obj1 = new Test();

		int ans1 = obj1.add(2,3);

		System.out.println("Ans1 is :"+ans1);


		float ans2 = obj1.add(2.2f,3.3f);

		System.out.println("Ans2 is :"+ans2);

	}


}