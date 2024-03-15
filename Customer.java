import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.Generator;

public class Customer {
    public String accountId;
    public String firstName;
    public String lastName;
    public List<Account>accounts;

    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // this.accountId = Generator.generateAccountId();
        this.accounts = new ArrayList<>();
    }

    public void setAccountId(String accountId)  {
        this.accountId = accountId;
    }
    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) throws Exception{
        for(Account account: accounts) {
            if(account.accountNumber.equals(accountNumber)) {
                return account;
            }
        }
        throw new Exception("Account not found");
    }
    
}
