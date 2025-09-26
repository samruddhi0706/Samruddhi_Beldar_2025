//Separate even and odd numbers into two arrays.

import java.util.Scanner;

  class Q15_array{
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
        for(int a : array){
            if(a % 2 == 0){
                evencnt++;
            }
            else{
                oddcnt++;
            }
        } 
        int evenarray[] = new int[evencnt];
        int oddarray[] = new int[oddcnt];
        int e = 0;
        int o = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]%2 ==0){
                evenarray[e++] = array[i];
            }
            else{
                oddarray[o++] = array[i];
            }
        }System.out.println(" ");
        System.out.println("even array from main array");
        System.out.print(" ");
        System.out.print(" ");
        for(int x: evenarray){
            System.out.print(x +" ");
        }
        System.out.println(" ");
        System.out.println("odd array from main array");
        for(int y: oddarray){
            System.out.print(y + " ");
        }
         sc.close();
        }

  }