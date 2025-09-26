//Rotate array to the left/right by k positions.

import java.util.Scanner;

   class Q17_array{
         public static void main(String[]args){

             Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array");
        for(int a : array){
            System.out.print(a + " ");
        }
         }
   }