public class BankTest{
    public static void main(String[] args){
        BankAccount kirkAccount = new BankAccount("Kirk");
        BankAccount jessAccount = new BankAccount("Jess", 250.00, 5000);
        kirkAccount.depositMoney("checking", 100);
        kirkAccount.displayAccountData();
        jessAccount.displayAccountData();
    }
}