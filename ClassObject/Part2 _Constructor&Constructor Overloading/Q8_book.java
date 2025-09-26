class Q8_book
{
   String name;
   String author;
   int price;


   Q8_book(){
    name = "unknown";
    author = "unknown";
    price = 0;
   }

  Q8_book(String n , String a, int p){
    name = n;
    author = a;
    price = p;

   }

   Q8_book(String n, String a){
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
       
    Q8_book b = new Q8_book();
    Q8_book  b1 = new Q8_book("java","james",2000);
    Q8_book  b2 = new Q8_book("java", "james");
     b.display();
     b1.display();
     b2.display();
  
    }

}