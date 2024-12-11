package Services;
public class Customer{
    private String name;
    private int customerId;
    private int accNo;
    private int balance;
    private String password;

    

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAccNo() {
        return accNo;
    }



    public Customer(String name, int customerId, int accNo, int balance, String password) {
        this.name = name;
        this.customerId = customerId;
        this.accNo = accNo;
        this.balance = balance;
        this.password = password;
    }

    

    @Override
    public String toString() {
        return "CustomerId -"+ customerId +" [name=" + name + ", accNo=" + accNo + ", balance=" + balance
                + ", password=" + password + "]\n";
    }

    
}