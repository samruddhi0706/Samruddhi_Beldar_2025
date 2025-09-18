
class Book
{
   String name;
   String author;
   int price;


   Book(){
    name = "unknown";
    author = "unknown";
    price = 0;
   }

   Book(String n , String a, int p){
    name = n;
    author = a;
    price = p;

   }

   Book(String n, String a){
    name = n;
    author = a;
    price = 100;
   }

   void display(){
    System.out.println("book name is: " + name);
    System.out.println("author of book is: " + author);
    System.out.println("price of book is: " + price);
    System.out.println(" ");
   }



   public static void main(String[] args) {
       
    Book b = new Book();
     Book  b1 = new Book("java","james",2000);
     Book  b2 = new Book("java", "james");
     b.display();
     b1.display();
     b2.display();
  
    }

}