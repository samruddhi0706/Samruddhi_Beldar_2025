/*1. Library Book Counter
Create a LibraryBook class:
Each time a new book is added, increment a static counter.
Assign a unique bookID starting from 501.
Write a method to display total books added so far.*/

class Q1_book{
    static int bookcount = 0;
    int bookId;
    String bookName;


    Q1_book(String bookName){
        bookcount++;
        this.bookId = 500+bookcount;
        this.bookName = bookName;

    }

    void display(){
        System.out.println("The book name is:" + bookName);
        System.out.println("the bookId is:" + bookId);
        
    }

    void displaytotal(){
        System.out.println("the total book count is:" + bookcount);
    }


    public static void main(String[]args){
        Q1_book obj1 = new Q1_book("java");
        Q1_book obj2 = new Q1_book("maths");
        Q1_book obj3 = new Q1_book("c++");
        obj1.display();
        obj2.display();
        obj3.display();

        obj3.displaytotal();
    }
}
