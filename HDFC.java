import java.math.BigDecimal;

public class HDFC extends Account implements BankAccount {
    public HDFC(String owner, BigDecimal balance ,AccountType acc) {
        super(owner, balance ,acc);
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        System.out.println("Deposited " +amount+ " and total balance is "+this.getBalance()+".");
    }

    @Override
    public void withdraw(BigDecimal amount) throws InsufficientAmount{
        super.withdraw(amount);
    }

    @Override
    public void setvalue() {

    }
}
