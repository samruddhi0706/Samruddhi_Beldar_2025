import java.util.Scanner;
   class Q1_Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter a year: ");
        int year = sc.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
     System.out.println(year + " is Leap Year.");
        } 
        else {
        System.out.println(year + " is not Leap Year.");
      }
   }
}