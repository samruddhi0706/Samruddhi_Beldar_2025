import java.util.Scanner;

class Q1_factorial{

 public static void main(String[]args){

   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
     int fact = 1;
     int num = sc.nextInt();

  while(num!=0){
   
  fact = fact*num;

 num = num-1;
}System.out.println("factorial of given number is:"+fact);
sc.close();
}
}