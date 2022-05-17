import LocalBank.*;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        Bank myBank = new Bank("<LOCAL BANK>");
        System.out.println("This is" + myBank.getName() + "ready to serve!");
        System.out.println("");

        int select = 0;

        while (select != 3) {
            System.out.println("///HOME PAGE///");
            System.out.println("Select Role:");
            System.out.println("1. Bank Admin");
            System.out.println("2. Customer");
            System.out.println("=====================================================");
            System.out.println("Enter your selection (num): ");

            select = inputs.nextInt();

            switch (select) {
                case 1:
                    int adminselect = 0;
                    while (adminselect != 4) {
                        System.out.println("=====================================================");
                        System.out.println("///ADMIN PAGE///");
                        System.out.println("Select Commands:");
                        System.out.println("1. Add new customer ");
                        System.out.println("2. Search customer (using index)");
                        System.out.println("3. Return to HOME PAGE");
                        System.out.println("=====================================================");
                        System.out.println("Enter your selection (num): ");
                    }

                    adminselect = inputs.nextInt();
                    Scanner n = new Scanner(System.in);

                    switch (adminselect) {
                        case 1:
                            System.out.println("=====================================================");

                            System.out.println("Enter customer's given name: ");
                            String givenname = n.nextLine();

                            System.out.println("Enter customer's family name: ");
                            String familyname = n.nextLine();

                            System.out.println("");
                            myBank.addCustomer(givenname, familyname);

                            System.out.println(
                                    "Dear Admin the " + givenname + " " + familyname + " account has been created");
                            break;

                        case 2:
                            System.out.println("=====================================================");
                            int custnum = myBank.getTotalCustomer();
                            System.out.println("Below is/are the list of customers: " + custnum);
                            break;

                        case 3:
                            System.out.println("=====================================================");
                            System.out.println("You will be back to the homepage...");
                            System.out.println("///////////////////////////////////");

                        default:
                            System.out.println("INput cannot be accepted....");
                            break;

                    }
                    n.close();
                    break;
                case 2:
                    int customselect = 0;
                    Akun akunbaru = new Akun(0);

                    while (customselect != 5) {
                        System.out.println("===============================================");
                        System.out.println("1. Create new account");
                        System.out.println("2. Check account balance");
                        System.out.println("3. Deposit");
                        System.out.println("4. Withdrawal");
                        System.out.println("///Enter Choice///");

                        customselect = inputs.nextInt();
                        Scanner customerr = new Scanner(System.in);

                        switch (customselect) {
                            case 1:
                                System.out.println("=========================================");
                                System.out.println("Please enter customer Given Name...");
                                String givenname = customerr.nextLine();

                                System.out.println("Plese enter customer Family Name...");
                                String familyname = customerr.nextLine();

                                System.out.println("=========================================");
                                myBank.addCustomer(givenname, familyname);
                                System.out.println(givenname + "-" + familyname + " is now added to the bank.");

                                System.out.println("===========================================");
                                System.out.println("Enter your first deposit: ");
                                Double depo = inputs.nextDouble();
                                akunbaru.Deposit(depo);
                                System.out.println("Your deposit is done. Thank You.");

                                break;

                            case 2:
                                System.out.println("=====================================");

                                Double blnc = akunbaru.getBalance();
                                System.out.println("Your balance is: " + blnc);
                                break;

                            case 3:
                                System.out.println("=====================================");
                                System.out.println("Enter amount you would like to deposit: ");
                                Double deposit = inputs.nextDouble();
                                akunbaru.Deposit(deposit);

                                break;

                            case 4:
                                System.out.println("=====================================");
                                System.out.println("Enter amount you would like to withdraw: ");
                                Double moneyout = inputs.nextDouble();

                                akunbaru.withdrawal(moneyout);

                                break;

                            case 5:
                                System.out.println("=====================================");
                                System.out.println("You will be back to the HOMEPAGE....");
                                System.out.println("=====================================");

                            default:
                                System.out.println("INput cannot be accepted....");
                                break;

                        }
                        customerr.close();
                    }
                    break;
                case 3:
                    System.out.println("See you soon in LOCAL BANK...");
                    System.out.println("Thank you for using our sytem :)");
                    break;

                default:
                    System.out.println("INput cannot be accepted....");
                    break;
            }

        }
        inputs.close();
    }
}