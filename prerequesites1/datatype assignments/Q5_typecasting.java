import java.util.Scanner;

class Q5_typecasting {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the integer number:");
         int a =sc.nextInt();
      System.out.println("enter the float number:");
        float b = sc.nextFloat();
       
        
        int add = a + (int)b;
        float add2 = a + b;

        System.out.println("add:" + add);
        System.out.println("add2:" + add2);

     sc.close();
    }
}
