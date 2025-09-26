/*3. Bank Account Tracker
Create a BankAccount class.
Each account has an accountNumber (auto-generated using a static variable, starts from 10001).
A static variable should keep track of the total accounts created.
A static method showTotalAccounts() displays the count.
 */

    class Q3_bank{
        static int accountNo = 10000;
        static int accountCnt = 0;


    

        Q3_bank( ){
            accountNo++;
            accountCnt++;
            System.out.println("the accountNo is:" + accountNo);
        }

        static void displayCount(){
        System.out.println("the count of total accounts created :"+ accountCnt);

        }

        public static void main(String[]args){
        Q3_bank obj1 = new Q3_bank();
        Q3_bank obj2 = new Q3_bank();
        Q3_bank.displayCount();

    }
}