import java.util.Date;
import utils.Generator;


public class Transaction {

    public String transactionId;
    public double amount;
    public TransactionType type;
    public Date date;

    Transaction(double amount, TransactionType type, Date date) {
        this.transactionId = Generator.generateUUID();
        this.amount = amount;
        this.type = type;
        this.date = date;
    }    
}