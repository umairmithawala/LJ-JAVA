// Use of this... jumpuing another cons

// Constructor program 
class temp{

	int id;
	int sem;

	
	//pera cons 2
	temp(int temp) {

		this(temp,temp);

	}

	//pera cons
	temp(int i, int s) {

		id = i;
		sem = s;

	}

	public static void main(String[] args) {

		temp s1 = new temp(2);

		System.out.println("S1 id is : "+s1.id);
		System.out.println("S1 sem is : "+s1.sem);

	}

}