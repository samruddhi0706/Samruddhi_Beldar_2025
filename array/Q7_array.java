import java.util.Scanner;
     class Q7_array{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int size = sc.nextInt();
            int []array = new int[size];
            boolean found = false;

            System.out.println("Enter the array elements:");

            for(int i = 0; i<array.length; i++){
                array[i] = sc.nextInt();
            }

            for(int a: array){
                System.out.print(a+ " ");
            }
            System.out.println(" ");
            System.out.println("Enter the key to search in array:");
            int key = sc.nextInt();

            for(int i = 0; i<array.length; i++){
                if(array[i]==key){
                     System.out.println("the key "+ key + " is found at index "+ i);
                    found = true;
                    break;
                }
            }
            
            if(found!=true){
                System.out.println("the key is not found at any index");
            
            }
           

           sc.close();
        }
     }