class Test
{
	public static void main(String args[]){
		int a = 10;
		int b = 10;

		try{
			int c = a/b;
			System.out.println("Value of c : "+c);

			int arr[] = new int[2];
			arr[10] = 100;
		}
		catch(ArithmeticException e){
			System.out.println("Invalid input : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can't access to the array index : "+e);
		}

		// This will handle unknown exceptions
		catch(Exception e){  			
			System.out.println("Unknown error occured : "+e);
		}

		finally{
			System.out.println("Finally Block excuted");
		}
	}
}