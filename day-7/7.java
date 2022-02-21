interface Ione{
	static final int i=10;

	void get();
}
interface Itwo{

	void show();
}
interface Ithree extends Ione,Itwo{
	void fun();
}
class One implements Ithree{
	public void get(){
		System.out.println("Get Function called");
	}  
	public void show(){
		System.out.println("Show Function called");

	}     
	public void fun(){
		
	}                                                                                                                                                                                                                                                                                 

	public static void main(String a[]){
		One obj1 = new One();
		obj1.get();
		obj1.show();
	}
}