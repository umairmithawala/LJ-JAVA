/*

    Objective : Copy Constructor
    Author : Umair
    Date : 14-02-22

*/

// Constructor program 
class temp{

	int id;

	
	//copy cons
	temp(temp t) {

		id = t.id;

	}

	//pera cons
	temp(int i, int s) {

		id = i;

	}

	public static void main(String[] args) {

		temp s1 = new temp(5,2);
		temp s2 =  new temp(s1);

		System.out.println("S1 id is : "+s1.id);
		System.out.println("S2 id is : "+s2.id);

	}

}