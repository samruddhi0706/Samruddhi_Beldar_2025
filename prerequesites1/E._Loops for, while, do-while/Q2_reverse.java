import java.util.Scanner;

 class Q2_reverse{

   public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
   int n;
   int reverse = 0;
    System.out.println("Enter he number that u want to reverse:");
    int num = sc.nextInt();

   while(num!=0){

    n = num%10;
    reverse = 10*reverse + n;
  
   num = num/10;
}
System.out.println("the reverse of given number is :"+ reverse);

sc.close();
}
}