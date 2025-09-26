//Overload a method area() in a class Geometry:
//area(int side) for square
//area(int l, int b) for rectangle
//area(double r) for circle

    class Q13_geometry{
        
        void area(int side){        
            int area =  side * side;
            System.out.println("the area of given square side is:" + area);
        }

        void area(int l, int b){
            int area = l*b;
            System.out.println("The area of rectangle is:" + area);
            
        }

        void area(double r){
            double area = 3.14 * r *r;
            System.out.println("the area of circle is:" + area);

        }

        public static void main(String[]args){
            Q13_geometry obj = new Q13_geometry();
            System.out.println(" ");
            obj.area(8);
            System.out.println(" ");
            System.out.println(" ");
            obj.area(5,7);
            System.out.println(" ");
            obj.area(4.4);

        }
       

    }