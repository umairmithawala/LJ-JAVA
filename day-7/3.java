interface Ione{
	static final int i=10;

	void get();
}
interface Itwo{

	void show();
}
class One implements Ione,Itwo{
	public void get(){
		System.out.println("Get Function called");
	}  
	public void show(){
		System.out.println("value of i : "+i);
	}                                                                                                                                                                                                                                                                                     

	public static void main(String a[]){
		One obj1 = new One();
		obj1.get();
		obj1.show();
	}
}