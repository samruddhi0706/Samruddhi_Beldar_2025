import java.util.Scanner;

    class Q2_array{

        public static void main(String[]args){
            System.out.println("Enter the integer number that upto u  want array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int sum = 0;
    
            int[]array = new int[size];
            System.out.println("enter the array integer:");

            for(int i= 0; i<array.length; i++)
            {
                array[i] = sc.nextInt();

            
            }
            System.out.println("the array of given integer is:");
            for(int a: array)
            {
                System.out.print(a+" ");
            }

            for(int i = 0 ; i<array.length; i++){
                sum = array[i] + sum;
            }
            int average = sum / size;

            System.out.println("sum of array elements is:" + sum);
            System.out.println("Average of array is:" + average);
            sc.close();
        }
    }