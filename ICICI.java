import java.math.BigDecimal;

public class ICICI extends Account implements BankAccount {
    public ICICI(String owner, BigDecimal balance) {
        super(owner, balance);
    }


    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);

    }

    @Override
    public void withdraw(BigDecimal amount) throws InsufficientAmount  {
        super.withdraw(amount);
        }

    }

