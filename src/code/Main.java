/**
 * The program creates instances of BankAccount and Bank
 * It also prints out dates from January 1, 1910, to December 30, 2025;
 * assumption is that each month will have 30 days
 *
 * @author vindy, marius, sam ordonez
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        final Bank bank;

        final BankAccount account1;
        final BankAccount account2;
        final BankAccount account3;
        final BankAccount account4;

        //These sets of initialization contain null and empty data
        //for testing purposes
        final BankAccount account5;
        final BankAccount account6;
        final BankAccount account7;


        bank = new Bank("Bank of Kanada");

        account1 = new BankAccount(100.0,
                                "abc111",
                                    "woods");
        account2 = new BankAccount(200.0,
                                "def222",
                                    "gates");
        account3 = new BankAccount(300.0,
                                "ghi333",
                                    "bezos");
        account4 = new BankAccount(400.0,
                                "jkl444",
                                    "zuckerberg");

        //Test if Bank program catches null or empty data
        account5 = new BankAccount(0.0,
                                null,
                                    null);

        //Test if Bank program catches null or empty data
        account6 = new BankAccount(0.0,
                                "",
                                    "         ");

        //Test if Bank program catches null or empty data
        account7 = new BankAccount(-100.99,
                                "xyz123",
                                    "musk");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);
        bank.addAccount(account6);
        bank.addAccount(account7);

        bank.depositTo(22.22, "def222");
        bank.getAccount("abc111").transferMoneyCad(5.00, bank.getAccount("ghi333"));
        bank.printAllCustomerData();

        System.out.println("---");

        Calendar calendar = new Calendar();
        calendar.printCalendar();
    }
}