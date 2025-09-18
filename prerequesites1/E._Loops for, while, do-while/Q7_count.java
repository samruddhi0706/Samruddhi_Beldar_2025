import java.util.Scanner;

 class Q7_count{

    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number to count the digit in number:");
       int cnt = 0;
       int num = sc.nextInt();

  while(num!=0){

  cnt++;
 num = num/10;
}
System.out.println("the count is:" + cnt);

 sc.close();
}
}
