import java.util.Scanner;
class Q1_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     float num = sc.nextFloat();
       
     int a = (int)num;
      
    float  decimal  =num - a;
        
        System.out.println("integer part is:" + a);
        System.out.println("decimal part is:" + decimal);
      
    }
}

