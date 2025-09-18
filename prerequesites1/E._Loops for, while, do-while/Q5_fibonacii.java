import java.util.Scanner;

 class Q5_fibonacii{

 public static void main(String[]args){

 int a =0;
 int b =1;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the last number upto which u want Fibonacci series:");

int num = sc.nextInt();

for(int i = 1; i<=num; i++){
System.out.print(a + " ");
int c = a + b;
a = b;
b = c;
}


sc.close();
}
}
