package LocalBank;

import java.util.ArrayList;

public class Bank {
    private int customertotal;
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Bank(String locName) {
        bankName = locName;
        customertotal = 0;
    }

    public String getName() {
        return bankName;
    }

    public void addCustomer(String fn, String ln) {
        Customer newEntry = new Customer(fn, ln);
        customers.add(newEntry);
        customertotal += 1;
    }

    public int getTotalCustomer() {
        return customertotal;
    }
}