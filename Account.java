
public class Account {
    private String name;
    private String id;
    private int balance = 0;
    public Account(String name, String id, int balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public Account(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
    public String getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getBalance()
    {
        return balance;
    }
    public int credit(int amount)
    {
        balance = balance + amount;
        return balance;
    }
    public int debit (int amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Amount Exceeded balance");
        }
        return balance;
    }
    public int transferTo(int amount, Account another)
    {
        if(amount <= balance)
        {
           another.balance = another.balance + amount ;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString()
    {
        String total = "Account[ id = "+ getID() + ", name = " + getName() + ", balance = " + getBalance() + "]";
        return total;
    }
    
    
    
}