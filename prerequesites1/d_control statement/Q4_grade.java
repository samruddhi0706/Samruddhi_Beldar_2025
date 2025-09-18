import java.util.Scanner;

class Q4_grade{

  public static void main(String[]args){

   Scanner sc = new Scanner(System.in);

   System.out.println("enter marks:");
   int marks = sc.nextInt();


 if(marks>=90){
  System.out.println("Grade A");
}
 else if(marks>=75){
   System.out.println("Grade B");
}
 else if(marks>50){
   System.out.println("Grade c");
}

else{
  System.out.println("Fail");

}

sc.close();

}

}
