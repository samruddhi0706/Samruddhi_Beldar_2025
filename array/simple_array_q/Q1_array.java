import java.util.Scanner;

    class Q1_array{
        public static void main(String[]args){
            System.out.println("Enter the integer number that u want array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
    
            int[]array = new int[size];
            System.out.println("enter the array integer:");

            for(int i= 0; i<array.length; i++)
            {
                array[i] = sc.nextInt();

            }
            for(int a: array)
            {
                System.out.print(a+" ");
            }
            sc.close();
        }
    }