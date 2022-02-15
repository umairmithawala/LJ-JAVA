// Constructor program 
class peracons{

	int id,sem;

	//default cons
	peracons() {

		id = 1;
		sem = 2;

	}

	//pera cons
	peracons(int i, int s) {

		id = i;
		sem = s;

	}

	public static void main(String[] args) {

		peracons s1 = new peracons(5,2);

		System.out.println("S1 id is : "+s1.id);
		System.out.println("S1 Sem is : "+s1.sem);

	}

}