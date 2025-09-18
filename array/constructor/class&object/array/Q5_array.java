import java.util.Scanner;

        class Q5_array{
              public static void main(String[]args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the integer upto which u want array:");
                int size;
                size = sc.nextInt();
                int[]array = new int[size];
                System.out.println("enter the array elements:");
                for(int i = 0; i<array.length; i++){
                    array[i] = sc.nextInt();
                }
                System.out.println("the original aarayy:");
                for(int a : array){
                    System.out.print(a + " ");
                
                }
                System.out.println(" ");
                System.out.println("after reversing the array:");
                 for (int i = 0, j = array.length - 1; i < j; i++, j--){
                    
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    for(int a : array){
                        System.out.print(a + " ");
                    }
                    sc.close();
                
                }
              }
        