import java.util.Date;

public class CurrentAccount extends Account {

    public double overDraftLimit;
    
    CurrentAccount (String accountNumber, double balance) {
        super();
    }

    public void setOverDraftLimit (double limit) {
        this.overDraftLimit = limit;
    }
    public void performOverDraft(double amount) {
        if(amount <= overDraftLimit){
            balance += amount;
            transactions.add(new Transaction(amount, TransactionType.OVERDRAFT, new Date()))
        } else {
            throw new Exception("Overdraft Limit exceeded. Overdraft Limit is: "+ overDraftLimit)
        }
    }
}