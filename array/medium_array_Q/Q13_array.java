//Merge two arrays into a third array.

import java.util.Scanner;

      class Q13_array{
        public static void main(String[]args){
          System.out.println("Enter the size of first array1:");
          Scanner sc = new Scanner(System.in);
          int size1 = sc.nextInt();
          int [] array1 = new int [size1];

          System.out.println("Enetr the array1 elements:");
          for(int i = 0; i<array1.length; i++){
            array1[i] = sc.nextInt();
          }
          System.out.println("first array");
          
          for(int a : array1){
            System.out.print(a + " ");
          }
          
          System.out.println(" ");
          System.out.println("Enter the second array size:");
          int size2  = sc.nextInt();
          int [] array2 = new int [size2];
          System.out.println("Enter the second array elements:");

          for(int i = 0; i<array2.length; i++){
            array2[i] = sc.nextInt();
          }
          System.out.println("second array");
       
          for(int a : array2){
            System.out.print(a + " ");
          }
           System.out.println(" ");
          System.out.println("now merging this two array into 3rd array as array3");
          int size3 = size1 + size2;
          int [] array3 = new int [size3];
          for(int i = 0; i<array1.length; i++){
            array3[i] = array1[i];
          }

          for(int i = size1, j = 0; i<array3.length; i++, j++){
               array3[i] = array2[j];
          }

          for(int c : array3){
            System.out.print(c + " ");
          }
        sc.close();
        }
        
      }