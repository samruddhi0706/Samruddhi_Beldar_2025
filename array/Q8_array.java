import java.util.Scanner;
    class Q8_array{
          public static void main(String[]args){
            System.out.println("Enter the size of array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[]array = new int[size];
            boolean found = false;
            System.out.println("Enter the array elements:");
            for(int i =0;i<array.length; i++){
                array[i] = sc.nextInt();
          }
          for(int a:array){
          System.out.print(a + " ");
          }
          System.out.println(" ");
          System.out.println("Enter the element to find in array:");
          int key = sc.nextInt();

          for(int i = 0; i<array.length; i++){
            if(key==array[i]){
              found = true;
              break;
            }
        }
            if(found==true){
               System.out.println("the given key is exists in array");  
            }
            else{
                System.out.println("The given element is not exist in array");
            }
        sc.close();
      }
    }

    