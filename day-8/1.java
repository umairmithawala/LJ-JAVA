import java.util.Scanner;

class Test
{
	public static void main(String args[]){
		int a = 0;
		int b = 0;
		int n = 0;
		int errCount = 3;

		Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("Enter no1 : ");
			a = input.nextInt();

			System.out.print("Enter no2 : ");
			b = input.nextInt();

			System.out.print("Enter the element you want to excess : ");
			n = input.nextInt();

			try{
				int c = a/b;
				System.out.println("Value of c : "+c);

				int arr[] = new int[2];
				arr[n] = 100;

				break;
			}
			catch(ArithmeticException e){
				errCount--;
				System.out.println("Invalid input : "+e);
			}
			catch(ArrayIndexOutOfBoundsException e){
				errCount--;
				System.out.println("Can't access to the array index : "+e);
			}

			if(errCount == 0){
				System.out.println("You have entered invalid input 3 times. Program is terminated.....");
				break;
			}

			System.out.println("\nAttempts remaining : "+errCount+"\n");
		}

	}
}