import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Zenith Bank, let's set up up your account");
        System.out.println("Enter Firstname: ");
        String firstName = scanner.nextLine(); 
        System.out.println("Enter Lastname: "); 
        String lastName = scanner.nextLine(); 

        Customer customer = new Customer(firstName, lastName);
        System.out.println("Customer Information :() Fullname: "+customer.firstName+ " "+customer.lastName);

        customer.addAccount(new Account());
        customer.addAccount(new Account());

        System.out.println("Customer now have "+ customer.accounts.size()+ " account(s)");

        for(Account account: customer.accounts) {
            System.out.println("Account number "+account.accountNumber+ " Balance"+ account.balance);
        }

        Account account = customer.accounts.get(0);

        try{
            customer.getAccount(account.accountNumber);
            System.out.println("Select action to perform, Enter 1 to DEPOSIT, Enter 2 to WITHDRAW, Enter 3 for OVERDRAFT, Enter 4 to check balance");

            int action =  scanner.nextInt();

            switch (action) {
                 case 1:
                    System.out.println("Enter amount for deposit:");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    System.out.println("Account number: "+account.accountNumber+ "Balance: "+ account.balance);

                    for(Transaction transaction: account.transactions) {
                        System.out.println("Transaction ID: "+ transaction.transactionId+ "Amount: "+ transaction.amount+ " Date: "+ transaction.date);
                    }
                    break;

                 case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawal = scanner.nextDouble();
                    account.withdraw(withdrawal);

                     System.out.println("Account number: "+account.accountNumber+ "Balance: "+ account.balance);

                    for(Transaction transaction: account.transactions) {
                        System.out.println("Transaction ID: "+ transaction.transactionId+ "Amount: "+ transaction.amount+ " Date: "+ transaction.date);
                    }
                    break;

                    default: 
                    System.out.println(" Invalid action. Check input display and try again");
            }

        }
        catch (Exception e) {
            e.printStackTrace();

        }




    }
    
}