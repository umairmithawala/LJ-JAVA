/*

    Objective : garbege collection
    Author : Umair
    Date : 14-02-22

*/

class Test {


	static int gcCount = 0;

	Test(){

		int a[] = new int[3200];
	}

	protected void finaliza(){

		gcCount++;
		System.out.println("Gc called :"+gcCount);
	}

	public static void main (String s[]){

		System.out.println("Welcome");

		for (int i=0; i<1000; i++) {
			
			Test obj1 = new Test();
			System.gc();

		}

		System.out.println("End of the prog");
	}

}