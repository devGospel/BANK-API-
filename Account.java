import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.Generator;

public class Account {

    public String accountNumber;
    public double balance;
    public List<Transaction>transactions;


    Account () {
        this.accountNumber = Generator.generateAccountNumber();
        this.balance = 0;
        this.transactions = new ArrayList<>();
        System.out.println("Your Account Number is "+ accountNumber);
    }


    public void deposit (double amount) {
        balance += amount;

        transactions.add(new Transaction(amount, TransactionType.DEPOSIT, new Date()));
    }

    public void withdraw (double amount) throws Exception {
        if (amount < balance) {
            transactions.add(new Transaction(amount, TransactionType.WITHDRAWAL, new Date()));
        }
        else {
            throw new Exception("Insufficient Funds");
        }
    }
}
