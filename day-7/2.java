interface Ione{
	static final int a=10;
}
interface Itwo{
	static final int b=20;
}
interface Ithree extends Ione,Itwo{
	static final int c=30;

}
class Test implements Ithree{                                                                                                                                                                                                                                                                             

	public static void main(String a[]){
		Test obj1 = new Test();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);

	}
}