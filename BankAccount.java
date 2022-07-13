import java.math.BigDecimal;

public interface BankAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount) throws InsufficientAmount;

}
