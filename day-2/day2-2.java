import java.util.Scanner;
class add{

	public static void main(String[] args) {
		
		int a,b,ans;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
     	a = sc.nextInt();

     	System.out.print("Enter second Number : ");
     	b = sc.nextInt();

     	int sum = a+b;

     	System.out.println("Ans is : "+sum);
	}

}