
package FirstProgram;

public class BankingOperations {

    double deposit(double balance, double depositamount) {
        return balance + depositamount;
    }

    double withdraw(double balance, double withdrawalamount) {
        if (withdrawalamount > balance) {
            System.out.println("Insufficient balance");
            return balance;
        } else {
            return balance - withdrawalamount;
        }
    }

    void checkBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }

    void displayTransactionSummary(double depositamount,
                                   double withdrawalamount,
                                   double finalbalance) {
        System.out.println("Deposit Amount: " + depositamount);
        System.out.println("Withdrawal Amount: " + withdrawalamount);
        System.out.println("Final Balance: " + finalbalance);
    }

    public static void main(String[] args) {

        BankingOperations obj = new BankingOperations();

        double balance = 5000;
        double depositamount = 2000;
        double withdrawalamount = 1500;

        balance = obj.deposit(balance, depositamount);

        balance = obj.withdraw(balance, withdrawalamount);

        obj.checkBalance(balance);

        obj.displayTransactionSummary(
            depositamount, withdrawalamount, balance);
    }
}
```