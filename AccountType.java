public enum AccountType {
    SAVING("saving_account"),
    CURRENT("current_account");

    public String value;

    AccountType(String current_account) {
    }

    public void setValue(String value) {
        this.value = value;
    }
}
