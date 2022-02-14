import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    private String memberName;
    private double checkingBalance;
    private double savingBalance;
    private String accountNumber;
    private DecimalFormat moneyFormat = new DecimalFormat("0.00");

    private static ArrayList<String> allAccountNumbers = new ArrayList<String>();
    private static int accountNumLength = 10;
    private static int numOfAccounts;
    private static double totalMoneyStored;
    private static Random randNumbers = new Random();

    public BankAccount(String _name){
        memberName = _name;
        checkingBalance = 0;
        savingBalance = 0;
        numOfAccounts++;
        accountNumber = setAccountNumber();
    }
    public BankAccount(String _name, double startCheckBalance){
        memberName = _name;
        checkingBalance = startCheckBalance;
        savingBalance = 0;
        totalMoneyStored += startCheckBalance;
        numOfAccounts++;
        accountNumber = setAccountNumber();
    }
    public BankAccount(String _name, double startCheckBalance, double startSaveBalance){
        memberName = _name;
        checkingBalance = startCheckBalance;
        savingBalance = startSaveBalance;
        totalMoneyStored += startCheckBalance + startSaveBalance;
        numOfAccounts++;
        accountNumber = setAccountNumber();
    }

    public void displayAccountData(){
        System.out.println(memberName);
        System.out.println(checkingBalance);
        System.out.println(savingBalance);
        System.out.println(accountNumber);
    }

    public double getChecking(){ return checkingBalance; }
    public String getCheckingFormatted(){ return moneyFormat.format(checkingBalance); }

    public double getSaving(){ return savingBalance; }
    public String getSavingFormatted(){ return moneyFormat.format(savingBalance); }

    public double displayAccountTotal(){return checkingBalance + savingBalance; }
    public String displayAccountTotalAsString(){return moneyFormat.format(checkingBalance + savingBalance); }

    public void depositMoney(String accountName, double amount){
        if(accountName.toLowerCase() == "checking"){
            checkingBalance+= amount;
        }
        else if(accountName.toLowerCase() == "saving"){
            savingBalance+= amount;
        }
        totalMoneyStored+= amount;
    }

    public void withdrawMoney(String accountName, double amount){
        if(accountName.toLowerCase() == "checking" && checkingBalance - amount >= 0){
            checkingBalance-= amount;
            totalMoneyStored-= amount;
        }
        else if(accountName.toLowerCase() == "saving" && savingBalance - amount >= 0){
            savingBalance-= amount;
            totalMoneyStored-= amount;
        }
    }

    private static String setAccountNumber(){
        String num = "";
        do{
            for(int i = 1; i <= accountNumLength; i++){
                num += Integer.toString(randNumbers.nextInt(10));
            }
        }while(allAccountNumbers.contains(num) && num != "");
        return num;
    }
}
