import java.util.Scanner;
class A{

    int id,sem;

    void getDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your ID : ");
        id = sc.nextInt();
    }

    public static void main(String[] args) {

        //create obj 
        A s1 = new A();

        s1.getDetails();
        System.out.println("First Student ID : "+s1.id);
        
    }

}