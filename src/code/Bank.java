import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * A representation of a bank in a simple banking system;
 * representing its own bank name, list of unique account numbers,
 * account member names, and account monetary balance
 *
 * @author vandna saxena, marius guerra, sam ordonez
 * @version 1.0
 */
public class Bank
{
    private final String                   bankName;
    private final Map<String, BankAccount> bankAccounts;

    /**
     * @param bankName Represents the name of the bank.
     */
    public Bank(final String bankName)
    {
        this.bankName       = bankName;
        this.bankAccounts   = new HashMap<>();
    }

    /**
     * Adds a new pair to the bank's list of accounts;
     * using the account number as the key, and an object expression of the BankAccount class as the value
     * @param newBankAccount a new BankAccount instance that has its own
     *                       unique account number, account member name,
     *                       and account monetary balance
     */
    public void addAccount(final BankAccount newBankAccount)
    {
        this.bankAccounts.put(newBankAccount.getAccountNumber(), newBankAccount);
    }

    /**
     * the unique account number of a bank account
     * @param accountNumber the unique account number of a bank account
     * @return the unique account number of a bank account
     */
    public BankAccount getAccount(final String accountNumber)
    {
        return this.bankAccounts.get(accountNumber);
    }

    /**
     * Removes the unique account number of a bank account from the list group
     * @param accountNumber the unique account number of a bank account
     */
    public void removeAccount(final String accountNumber)
    {
        this.bankAccounts.remove(accountNumber);
    }

    /**
     * Access the number/size of bank accounts in the list group
     * @return the number/size of bank accounts in the list group
     */
    public int getNumberOfAccounts()
    {
        return this.bankAccounts.size();
    }

    /**
     * Access the total amount of money, in CAD,
     * of all the bank accounts in the bank system
     * @return the total amount of money, in CAD,
     *         of all the bank accounts in the bank system
     */
    public double getTotalAccountsBalance()
    {
        double totalCdn;
        totalCdn = 0.0;

        for(final BankAccount account : this.bankAccounts.values())
        {
            //Disregard bank accounts with negative balance
            if(account.getBalanceCdn() >= 0)
            {
                totalCdn += account.getBalanceCdn();
            }
        }
        return totalCdn;
    }

    /**
     * Deposits money, in CAD, to an account number
     * @param amountCdn money, in CAD, to be deposited
     * @param accountNumber the unique account number
     *                      where the money will be deposited
     */
    public void depositTo(final double amountCdn,
                          final String accountNumber)
    {
        this.bankAccounts.get(accountNumber).depositMoneyCad(amountCdn);
    }


    /**
     * Iterates through the bank's accounts,
     * printing customer information such as
     * the last name, account balance, and account number.
     */
    public void printAllCustomerData()
    {
        final Set<String>       keys;
        final Iterator<String>  it;

        keys    = bankAccounts.keySet();
        it      = keys.iterator();

        while(it.hasNext())
        {
            final String        theNextKey;
            final BankAccount   account;

            theNextKey  = it.next();
            account     = this.bankAccounts.get(theNextKey);

            if(account != null)
            {
                if(account.getMemberLastName() != null && !account.getMemberLastName().isBlank()
                        && account.getBalanceCdn() >= 0)
                {
                    System.out.printf("Customer %s has $%.2f in account #%s\n",
                            account.getMemberLastName(), account.getBalanceCdn(), theNextKey);
                }
            }
        }

        System.out.printf("Total bank balance in all accounts for %s is %.2f\n",
                this.bankName, this.getTotalAccountsBalance());
    }
}