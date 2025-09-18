import java.util.Scanner;

class Q2_break{
    public static void main(String[]args){
        for(int i = 1; i<=20; i++){
            if(i% 5 == 0){
              continue;
          }


     if(i==12){
         break;
     }


     System.out.println(i);
    }
}
}