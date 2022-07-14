import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InsufficientAmount {
        ICICI Owner_1 = new ICICI("Nidhi_kanwar", BigDecimal.valueOf(1000),AccountType.SAVING ,BigDecimal.valueOf(1000));
        HDFC Owner_2 = new HDFC("Ragini_patel", BigDecimal.valueOf(15000),AccountType.CURRENT , BigDecimal.valueOf(1000));
//        Owner_1.withdraw(BigDecimal.valueOf(2000));
        UPI Nidhi = new UPI(Owner_1,BigDecimal.valueOf(123445));
        UPI ragini = new UPI(Owner_2,BigDecimal.valueOf(125754));
        Nidhi.transfer(BigDecimal.valueOf(100),ragini);
        Owner_1.setOverdraft(BigDecimal.valueOf(100));

        Owner_2.withdraw(BigDecimal.valueOf(100));
    }
}
