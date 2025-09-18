import java.util.Scanner;

class Q4_mathopr{
 
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        int choice;


 do{
  System.out.println("-----MENU-------");
  System.out.println("1.addition");
  System.out.println("2.subtraction");
  System.out.println("3.multiplication");
  System.out.println("4.division");
  System.out.println("5.Exit");
       

System.out.println("enter the operation that u want to do from menu:");
  choice = sc.nextInt();


 
 switch(choice){

  case 1:
          System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();
      System.out.println("the addition of given two number is:"+ (a+b));
break;

  case 2:
      System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();

      System.out.println("the subtraction of given two number is:" +(a-b));
break;

  case 3:
       System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();

       System.out.println("the multiplication of given two number is:" +(a*b));
break;

  case 4:
     System.out.print("Enter two numbers: ");
                    int a = sc.nextInt(), b = sc.nextInt();

     System.out.println("the division of given two number is:"+ (a/b));
break;
  case 5:
    System.out.println("invalid input");

}



}while(choice != 5);


 sc.close();
}
}

