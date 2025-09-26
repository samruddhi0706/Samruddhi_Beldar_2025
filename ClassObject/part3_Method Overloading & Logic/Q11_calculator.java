   class Q11_calculator{
    double squareroot;
       
           void calculate(int num){
                int square = num*num;
                System.out.println("the sqaure of given number is:" + square);
            }

           void calculate(int num, String b){
                int cube = num*num*num;
                System.out.println("the cube of given number is:" + cube);
            }

           void calculate(double num){
                for (int i = 1; i <= num; i++) {
                    if (i * i == num) {
                        squareroot = i;
                        break;
                } 
                else if (i * i > num) {
                        squareroot = i - 1;
                        break;
                }
            }
            System.out.println("the square root of given number is:" + squareroot);
            }

         
   
  
    public static void main(String[]args){
        Q11_calculator cal = new Q11_calculator();
        cal.calculate(5);
        cal.calculate(8,"cube");
        cal.calculate(16.0);


    }
}
