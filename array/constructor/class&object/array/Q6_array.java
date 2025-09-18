import java.util.Scanner;

         class Q6_array{
            public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the array size:");
               
               int size = sc.nextInt();
                int[]array = new int[size];
                int[]array2 = new int[size];
                System.out.println("ENTER THE ARRAY ELEMENTS:");
            for(int i = 0; i<array.length; i++){
                array[i] = sc.nextInt();
               }

            for(int a:array){
               System.out.print(a + " ");
               }
              System.out.println(" ");
              System.out.println("now copying this array into second array named as array2:");

              for(int i =0; i<array.length; i++){
                  array2[i] = array[i];

              }
              for(int a:array2){
                System.out.print(a + " ");
              }

            sc.close();
            }
         }