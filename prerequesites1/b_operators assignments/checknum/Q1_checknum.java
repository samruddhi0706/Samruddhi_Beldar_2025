import java.util.Scanner;

class Q1_checknum{

   public static void main(String[]args){

     Scanner sc = new Scanner(System.in);

      System.out.println("enter the number:");

     int num = sc.nextInt();


   if(num>0){
     System.out.println("the number is positive");
   }
else if(num<0){
     System.out.println("the number is negative");
}
   else{
     System.out.println("the number is zero");
   }


 sc.close();

  
}
}

