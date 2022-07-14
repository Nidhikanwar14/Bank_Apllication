import java.math.BigDecimal;

abstract class Account {
     private String owner;
    private BigDecimal balance;
    private  AccountType account;

    public BigDecimal Overdraft = BigDecimal.valueOf(0);
    public BigDecimal minAmount = BigDecimal.valueOf(0);

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Account(String owner, BigDecimal balance , AccountType acc , BigDecimal minAmount ) throws InsufficientAmount{
        this.owner = owner;
        this.minAmount  = minAmount ;
       try {
           if (balance.compareTo(this.minAmount) >= 0) {
               this.balance = balance;
           } else {
               throw new InsufficientAmount("Insufficient balance!");
           }
       }
           catch(InsufficientAmount e){
                e.getMessage();
//                throw new InsufficientAmount("Insufficient balance!");
           }

        this.account = acc;
    }

    public void deposit(BigDecimal amount){
        this.balance = this.balance.add(amount);
        System.out.println("Deposited " +amount+ " to " +this.owner+ " and total balance of "+this.owner+ " is "+this.getBalance()+".");
    }


    public void withdraw(BigDecimal amount) throws InsufficientAmount {
            try {
                if(this.balance.compareTo(amount) >= 0){
                    this.balance = this.balance.subtract(amount);}
                else{
                throw new InsufficientAmount("Insufficient balance!");}
//                System.out.println("Insufficient balance!");
            } catch (InsufficientAmount e) {
               e.getMessage();
//               throw new InsufficientAmount("Insufficient balance!");
            }
        }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;
    }
//   @Override
    public boolean checkvalue(BigDecimal amount){
        if(this.account== AccountType.SAVING){
            BigDecimal temp = this.balance.add(this.Overdraft);
            return temp.compareTo(amount) >= 0;
        }
        boolean value = this.balance.compareTo(amount) >= 0;
        return value;
    }


    public void setOverdraft(BigDecimal amount){
        this.Overdraft =  amount;
    }

    public AccountType getAccount() {
        return account;
    }

    public void setAccount(AccountType account) {
        this.account = account;
    }

    public BigDecimal getOverdraft() {
        return Overdraft;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

}
