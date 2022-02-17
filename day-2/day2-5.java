class day2_5{

	public static void main(String[] args) {
		
		int i,j;
		outer:

		for (i=0; i<10; i++) {
				
				for (j=0; j<10; j++) {
						
						if (j == 1) 

							break outer;
						
						System.out.println("Value of j = "+ j);
				}
		}

	}

}