package LocalBank;

public class Customer {
    private String first;
    private String last;
    private Akun account;

    public Customer(String fn, String ln) {
        first = fn;
        last = ln;
        account = new Akun(0.0);
    }

    public String getFamName() {
        return last;
    }

    public String getGivenName() {
        return first;
    }

    public Akun getAccount() {
        return account;
    }

    public void setAccount(Akun acc) {
        account = acc;
    }
}
