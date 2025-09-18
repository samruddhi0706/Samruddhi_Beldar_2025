//Overload showDetails() in a class Vehicle to display:
//Only name
//Name and speed
//Name, speed, and price

class Q14_vehicle{


    void showdetails(String name){
        System.out.println("The name of vehicle is:"+ name);
    }

    void showdetails(String name, int speed){
        System.out.println("The name of vehicle is:" + name);
        System.out.println("The speed of vehicle is:" + speed+"kmhr");

    }

    void showdetails(String name, int speed, float price){
        
        System.out.println("The name of vehicle is:" + name);
        System.out.println("The speed of vehicle is:" + speed+"kmhr");
        System.out.println("THE price of vehicle is:" + price);
    }

    public static void main(String[]args){
        Q14_vehicle obj = new Q14_vehicle();
        System.out.println("DISPLAY VEHICLE NAME:");
        obj.showdetails("activa");
        System.out.println(" ");
        System.out.println("Display details of vehicle name and speed");
        obj.showdetails("activa",100);
        System.out.println(" ");
        System.out.println("Display full details of vehicle");
        obj.showdetails("activa",100,10000);
    }

}
