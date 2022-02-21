/*

    Objective : Initialize block
    Author : Umair
    Date : 14-02-22

*/
class Block{


	// occure once time
	static {
		System.out.println("I am in static");
	}

	//occure when obj create
	{
		System.out.println("I am in init");
	}

	Block(){
		System.out.println("In Cons");
	}

	public static void main(String[] args) {
		Block s1 = new Block();
		Block s2 = new Block();
	}
}