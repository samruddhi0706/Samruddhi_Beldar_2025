import java.util.Scanner;

class Q4_unicode{

 public static void main(String[]args){

 Scanner sc = new Scanner(System.in);

 System.out.println("enter a character:");
 char ch = sc.next().charAt(0);

System.out.println("Unicode value:" + (int)ch);

sc.close();
}
}