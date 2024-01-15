/**
 * Description goes here...
 *
 * @author vindy, marius, sam ordonez
 * @version 1.0
 */
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final String                    bankName;
    private final Map<String, BankAccount> bankAccounts;

    public Bank(final String bankName)
    {
        this.bankName = bankName;
        this.bankAccounts = new HashMap<>();
    }

    public void addAccount(BankAccount newBankAccount)
    {
        this.bankAccounts.put(newBankAccount.getAccountNumber(), newBankAccount);
    }

    public BankAccount getAccount(String accountNumber)
    {
        return this.bankAccounts.get(accountNumber);
    }

    public void removeAccount(String accountNumber)
    {
        this.bankAccounts.remove(accountNumber);
    }

    public int getNumberOfAccounts()
    {
        return this.bankAccounts.size();
    }

    public double getTotalAccountsBalance()
    {
        double totalCdn = 0.0;
        for (BankAccount account : this.bankAccounts.values()) {
            totalCdn += account.getBalanceCdn();
        }
        return totalCdn;
    }

    public void depositTo(double amountCdn, String accountNumber)
    {
        this.bankAccounts.get(accountNumber).depositMoneyCad(amountCdn);
    }

    public void printAllCustomerData() {
        for (BankAccount account : this.bankAccounts.values())
        {
            System.out.printf("Customer %s has $%.2f in account #%s\n", account.getMemberLastName(), account.getBalanceCdn(), account.getAccountNumber());
        }
        System.out.printf("Total bank balance in all accounts for %s is %.2f\n", this.bankName, this.getTotalAccountsBalance());
    }
}
