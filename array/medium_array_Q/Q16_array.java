//Find the difference between sum of even-index and odd-index elements.

import java.util.Scanner;

      class Q16_array{
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
        int evencnt = 0;
        int oddcnt = 0;
        for(int i = 0; i<array.length; i++){
            if(i % 2 == 0){
                evencnt++;
            }
            else{
                oddcnt++;
            }
        } 
        System.out.println(" ");
        int sum = evencnt - oddcnt;
        System.out.println("the sum of evenindex amd oddindex is:" + sum);
        }
      }