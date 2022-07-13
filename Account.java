import java.math.BigDecimal;

abstract class Account {
     private String owner;
    private BigDecimal balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Account(String owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
        System.out.println("Deposited " +amount+ " to " +this.owner+ " and total balance of "+this.owner+ " is "+this.getBalance()+".");
    }

    public void withdraw(BigDecimal amount) throws InsufficientAmount {
        if (checkvalue(amount) < 0) {
            try {
                throw new InsufficientAmount("Insufficient balance!");
//                System.out.println("Insufficient balance!");
            } catch (InsufficientAmount e) {
                System.out.println("Insufficient amount!");
            }
        }
       else {
           this.balance = this.balance.subtract(amount);
           System.out.println(this.owner+" Withdraw " +amount+ " from total balance and remaining amount is "+this.getBalance()+".");
       }
    }
    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int checkvalue(BigDecimal amount){
        return this.balance.compareTo(amount);
    }
}
