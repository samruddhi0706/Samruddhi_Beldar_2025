import java.util.Scanner;

class Q2_sum {

public static void main(String[]args){

int sum = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the 3 digit number only:");
     int num = sc.nextInt();
  

 while(num !=0)
{
int digit = num%10;
sum = sum + digit;

num = num/10;
}
System.out.println("sum of  3 digit number is:" + sum);

sc.close();
}
}