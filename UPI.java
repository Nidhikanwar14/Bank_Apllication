import java.math.BigDecimal;

public class UPI {
    Account account;
    BigDecimal upi_id;

    public UPI(Account account, BigDecimal upi_id) {

        this.account = account;
        this.upi_id = upi_id;
    }

    public void transfer(BigDecimal amount, UPI destination) throws InsufficientAmount {
        if (this == destination) {
            System.out.println("Cann't transfer to the same account");
        } else {
            this.account.withdraw(amount);
            destination.account.deposit(amount);
        }
    }


//    public void receive(BigDecimal amount){
//
//    }
}



