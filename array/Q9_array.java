import java.util.Scanner;
    class Q9_array{
        public static void main(String[]args){
            System.out.println("Enter the size of array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[]array = new int[size];
            boolean found = false;
            System.out.println("Enter the array elements:");
            for(int i =0;i<array.length; i++){
                array[i] = sc.nextInt();
          }System.out.println("the array element is:");
            for(int a:array){
              System.out.print(a + " ");
           }
            System.out.println(" ");
            System.out.println("the negative element from array is:");
        for(int i = 0; i<array.length; i++){
            if(array[i]<0){
                System.out.print(array[i] +" ");
                found = true;
               
            }
        }
         if(found!=true){
            System.out.println("not negative number in array");
         }
         sc.close();
        }
    }