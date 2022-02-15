/*
    Objective : Un Structured Array 
    Author : Umair
    Date : 14-02-22
*/
class arraythree{

    public static void main (String args[]){

        //define array
        int i,j,count = 1;

        //define structure of array
        int b[][] = new int[2][];
        b[0] = new int [2];
        b[1] = new int [3];

        //create for loop
        for (i=0; i<b.length; i++) {
            for (j=0; j<b[i].length; j++){
                b[i][j] = count;
                count++;
            }
        }

        //print value of loop
        for (i=0; i<b.length; i++){
            for (j=0; j<b[i].length; j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println(" ");
        }

    }

} 