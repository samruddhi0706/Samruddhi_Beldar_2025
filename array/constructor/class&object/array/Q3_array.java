import java.util.Scanner;

   class Q3_array{
        public static void main(String[]args){
            System.out.println("Enter the integer number that upto u  want array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
    
            int[]array = new int[size];
            System.out.println("enter the array integer:");
            int evencnt = 0;
            int oddcnt = 0;

            for(int i= 0; i<array.length; i++)
            {
                array[i] = sc.nextInt();

                
                if(array[i]%2 == 0){
                    evencnt++;
                
                }
                else{
                    oddcnt++;
                }

            
            }
              System.out.println("the array of given integer is:");
            for(int a: array)
            {
                System.out.print(a+" ");
            }

           
            System.out.println();
           
            System.out.println("the evnn number count in array is:"+ evencnt);
            System.out.println("the odd number count in array is:"+ oddcnt);


        }
   }