public class SavingsAccount extends Account {

    public double interestRate;

    SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    SavingsAccount (String accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = 0;
    }

    public void setInterestRate (double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest () {
        
    }
    
}