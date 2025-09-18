import java.util.Scanner;
class Q3_evenodd{
public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("accept the number to check even and odd");
    int a = sc.nextInt();
    
    if(a%2==0)
    {
        System.out.println("the given number is even no");
    }
    else
    {
        System.out.println("the given no is odd number");
    }

}
}