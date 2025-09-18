import java.util.Scanner;

 class Q3_palindrome{

  public static void main(String[]args){

  Scanner sc = new Scanner(System.in);

int rev = 0;
 System.out.println("Enter the number to check whether it is palindrome or not");

 int num = sc.nextInt();
 int temp = num;

 while(num!= 0){
 int numm = num%10;
 rev = rev*10+numm;
num = num/10;
}

if(temp == rev)
{
 System.out.println(temp + " is palindrome number");
}
else{
System.out.println("not palindrome number");
}
sc.close();
}
}

 

 