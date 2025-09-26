//Sort the array in ascending and descending order (Bubble or Selection Sort).


import java.util.Scanner;

class Q12_array{

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for(int a : array){
            System.out.print(a + " ");
        }

    
       System.out.println(" ");
       System.out.println("now sorting the array in ascending order");

       for(int i = 0; i<array.length; i++){
        for(int j = 0; j < size-1; j++){
            if(array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            
        }
    }
        for(int a: array){
        System.out.print(a + " ");
       }
        
      System.out.println(" ");
      System.out.println("now sorting the array in descending order");
       
       for(int i = 0; i<array.length; i++){
        for(int j = 0; j < size-1; j++){
            if(array[j] < array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            
        }
        
        
    }
       
       for(int b: array){
        System.out.print(b + " ");
       }
       
     sc.close(); 
    
}
}
    
