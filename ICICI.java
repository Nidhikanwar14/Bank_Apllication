import java.math.BigDecimal;

public class ICICI extends Account implements BankAccount {
    public ICICI(String owner, BigDecimal balance , AccountType acc , BigDecimal minAmount) throws InsufficientAmount {
        super(owner, balance ,acc , minAmount );
//        super.setOverdraft(this.getBalance().multiply(BigDecimal.valueOf(0.2)));
    }


    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
//        System.out.println("Deposited " +amount+ " and total balance is "+this.getBalance()+".");

    }

    @Override
    public void withdraw(BigDecimal amount) throws InsufficientAmount  {
        super.withdraw(amount);
//        System.out.println(this.getOwner()+" Withdraw " +amount+ " from total balance.");

    }

    public void setOverdraft(BigDecimal amount){
        this.Overdraft = amount;
    }

}

