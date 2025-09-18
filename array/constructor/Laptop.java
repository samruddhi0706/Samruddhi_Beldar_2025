
class Laptop{
String company_name;
String model;
float price;



Laptop(String n)
{

company_name = n;
model = "unknown";
price = 0.0f;
}

Laptop(String company_, String model_)
{

  company_name =company_;
  model = model_;
  price = 0.0f;
}

Laptop(String company_,String model_,float  price_)
{

company_name = company_;
model = model_;
price = price_;
}

 void display() {
        System.out.println("Company: " + company_name);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
 }

public static void main(String[]args)
{

Laptop  l1 = new Laptop("hp");
Laptop l2  =  new Laptop ("hp","ss");
Laptop l3 = new Laptop("sfsfs","wfs",37.5f);
 
l1.display();
System.out.println(" ");
l2.display();
System.out.println(" ");
l3.display();


}
}

