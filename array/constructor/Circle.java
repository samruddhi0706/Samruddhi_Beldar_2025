import java.util.Scanner;

class Circle{

    int radius;
    float area;
    float circumference;


    Circle(int radiuss)
    {
        radius = radiuss;
        area = 3.14f * radius * radius;
        circumference = 2 * 3.14f * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int radiuss = sc.nextInt();
      System.out.println("enter the radius of circle:");
        Circle c = new Circle(radiuss);
        c.display();
    }
}