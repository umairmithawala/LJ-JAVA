/*
    Objective : 2D Array
    Author : Umair
    Date : 14-02-22
*/
class arraytwo{

    public static void main (String args[]){

        //define array
        int i,j,count = 1;

        //define structure of array
        int a[][] = new int[2][3];

        //create for loop
        for (i=0; i<2; i++) {
            for (j=0; j<3; j++){
                a[i][j] = count;
                count++;
            }
        }

        //print value of loop
        for (i=0; i<2; i++){
            for (j=0; j<3; j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }

    }

} 