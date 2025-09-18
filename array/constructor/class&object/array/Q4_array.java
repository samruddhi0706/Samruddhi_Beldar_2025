import java.util.Scanner;

 class Q4_array{
          public static void main(String[]args)
          {
            System.out.println("Enter the integer number that upto u  want array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
    
            int[]array = new int[size];
            System.out.println("enter the array integer:");
            

            for(int i= 0; i<array.length; i++)
            {
                array[i] = sc.nextInt();
            }
                int max = array[0];
                int min = array[0];
            for(int i = 1 ; i<array.length; i++){

                if(array[i]>max){
                  max = array[i];
                }
                if(array[i]<min){
                    min = array[i];
               }
            }
            for(int a: array)
            {
                System.out.print(a+" ");
            }
            System.out.println(" ");
            System.out.println("the minimum element in array is:" + min);
            System.out.println("the maximum element in array is:" + max);



          }
 }