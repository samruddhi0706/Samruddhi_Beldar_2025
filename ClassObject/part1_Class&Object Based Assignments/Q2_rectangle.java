//Design a class Rectangle with length and breadth. Create methods to calculate area and perimeter. Then, accept 3 rectangles and display the one with the largest area.

   class Q2_rectangle{
    int length;
    int breadth;


    Q2_rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }

    int  area(){
       return  length*breadth;
        
    }

    int  perimeter(){
        return  2*(length+breadth);
        
    }

    public static void main(String[]args){
        Q2_rectangle r1 = new Q2_rectangle(5,6);
        Q2_rectangle r2 = new Q2_rectangle(7,8);
        Q2_rectangle r3 = new Q2_rectangle(3,7);


        Q2_rectangle largest = r1;

        if(r2.area()>largest.area()){
            largest = r2;
        }

        if(r3.area()>largest.area()){
            largest = r3;
        }
        System.out.println("largest area rectangle details:");
        System.out.println("area: " + largest.area());
        System.out.println("perimeter: " + largest.perimeter());
    }
   }