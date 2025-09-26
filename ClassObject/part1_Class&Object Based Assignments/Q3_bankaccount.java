//Create a class BankAccount with account number, holder name, and balance. Implement deposit and withdraw methods. Display updated balance after each transaction.

   class Q3_bankaccount{
        int accountNo;
        String holderName;
        double balance;


        Q3_bankaccount(int accno,String holName,double bal){
            this.accountNo = accno;
            this.holderName = holderName;
            this.balance = bal;
        }

        void deposite(double de_balance){
            balance = balance + de_balance;
            System.out.println("Deposited:"+ de_balance);
            System.out.println("balance:" + balance);
        }


        void withdraw(double w_balance){
            balance = balance + w_balance;
            System.out.println("withdraw amount:" + w_balance );
            System.out.println("balance:" + balance);
        }

    public static void main(String[]args){
            Q3_bankaccount obj = new Q3_bankaccount(1234,"samruddhi",75000);
            obj.deposite(5000);
            obj.withdraw(70000);
        }
        
   }