class Student3{
    static int add(int a, int b){
        int ans = a + b;
        return ans;			

   }
   static float add(float a, float b){

       float ans = a + b;
       return ans;		

   }
   static int sub(int a, int b){

       int ans = a - b;
       return ans;		

   }
   static float sub(float a, float b){

       float ans = a - b;
       return ans;		

   }
   static int mul(int a, int b){

       int ans = a * b;
       return ans;		

   }
   static float mul(float a, float b){

       
       float ans = a * b;
       return ans;
   }
   static int div(int a, int b){
       int ans = a / b;
       return ans;
   }
   static float div(float a, float b){
       float ans = a / b;
       return ans;
   }

   public static void main(String args[]){
        int ans= add(2,3);

        System.out.println(ans);

         float ans2= add(2.4f,3.8f);

        System.out.println(ans2);
       
   }
}