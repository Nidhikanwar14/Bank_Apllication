import java.math.BigDecimal;

public class ICICI extends Account implements BankAccount {
    public ICICI(String owner, BigDecimal balance , AccountType acc) {
        super(owner, balance ,acc );
        super.setOverdraft(this.getBalance().multiply(BigDecimal.valueOf(0.2)));
    }


    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);

    }

    @Override
    public void withdraw(BigDecimal amount) throws InsufficientAmount  {
        super.withdraw(amount);
        }

    @Override
    public void setvalue() {

    }

}

