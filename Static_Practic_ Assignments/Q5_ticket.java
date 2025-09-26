/*Problem:
Create a TicketBooking class:
Each booking should have a unique booking ID (auto-generated using a static variable).
Booking IDs should start from 1001 but skip any number divisible by 5.
Write a program to create 10 bookings and print their IDs.
 */

    class Q5_ticket{
        static int bookingId = 1001;
        String Name;
        int id;


        Q5_ticket(String name){
            this.Name = name;

            while (bookingId % 5 == 0) {
            bookingId++;
        }

        this.id = bookingId; 
        bookingId++;                
    }

            void display(){
                System.out.println("Name:" + Name);
            }

            static void displaycnt(){
                System.out.println("total bookingid count :" + bookingId);
            }


        
        public static void main(String[] args) {
            Q5_ticket[] booking = new Q5_ticket[10];
            booking[0] = new Q5_ticket("samruddhi");
            booking[1] = new Q5_ticket("Neha");
            booking[2] = new Q5_ticket("tanisha");
            booking[3] = new Q5_ticket("juee");
            booking[4] = new Q5_ticket("parul");
            booking[5] = new Q5_ticket("peehu");
            booking[6] = new Q5_ticket("geg");
            booking[7] = new Q5_ticket("tanushri");
            booking[8] = new Q5_ticket("sejal");
            booking[9] = new Q5_ticket("taani");

            for(Q5_ticket b : booking){
                b.display();
            }
            Q5_ticket.displaycnt();

           
        }

    }