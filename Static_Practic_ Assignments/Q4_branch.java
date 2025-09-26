/*  Company Branches
Create a Company class with:
Static variable companyName.
Static variable totalBranches.
Every time a new branch (object) is created, increment totalBranches.
Show that changing companyName reflects in all objects.
*/

   class Q4_branch{
       static String companyName;
       static int totalbranches = 0;
       String branchName;


       Q4_branch(String branchname){
        this.branchName = branchname;
        totalbranches++;
        }

        void display(){
            System.out.println("the company Name is:" + companyName);
            System.out.println("branchname:" + branchName);
            
        }
        void displaytotal(){
            System.out.println("the total branch created  is:" + totalbranches);
        }

        public static void main(String[]args){
            Q4_branch.companyName = "puma";
            

            Q4_branch obj = new Q4_branch("PUNE");
            Q4_branch obj2 = new Q4_branch("delhi");
            Q4_branch obj3 = new Q4_branch("Baramati");

            obj.display();
            obj2.display();
            obj3.display();
            obj.displaytotal();
        }

       
   }