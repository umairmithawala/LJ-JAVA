interface Ione{
	int i=10;

	void fun();
}

class One implements Ione{
	public void fun(){
		System.out.println("value of i : "+i);
	}                                                                                                                                                                                                                                                                                     

	public static void main(String a[]){
		One obj1 = new One();
		Ione ref;

		ref=obj1;

		ref.fun();
	}
}
