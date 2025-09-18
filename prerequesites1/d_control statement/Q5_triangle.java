import java.util.Scanner;
class Q5_triangle{
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("accept the 3 sides of triangle  a");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(a+b>c && b+c>a && a+c>b)
    {
        System.out.println("the given triangle is valid");
    }
    else
    {
        System.out.println("the given not valid");
    }

}
}