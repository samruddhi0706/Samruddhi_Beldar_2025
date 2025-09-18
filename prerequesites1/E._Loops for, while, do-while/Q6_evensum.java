import java.util.Scanner;

 class Q6_evensum{
  
   public static void main(String[]args){

  Scanner sc = new Scanner(System.in);
   System.out.println("enter the digit:");
int num = sc.nextInt();
int sum = 0;
 while(num!=0){

 int numm = num%10;

if(numm%2 == 0)
{
  sum = sum+numm;
}
num = num/10;
}

System.out.println("the sum of even digits only from given number:" + sum);



sc.close();
}
}
 
  


 