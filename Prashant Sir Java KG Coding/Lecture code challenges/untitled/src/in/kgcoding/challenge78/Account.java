package in.kgcoding.challenge78;

public class Account {
    private String accountholdername;
    private int accountNumber;
    private long balance;

    Account(String accholdername , int accountNumber){
        this.accountholdername = accholdername;
        this.accountNumber = accountNumber;
    }

    public long deposite(long money){
        if(money <= 0){
            System.out.println("Invalid deposit");
        }else{
            balance += money;
        }return balance;
    }
    public long withdrawmoney(long money){
        if(money <= 0){
        System.out.println("Invalid withdraw");
    }else if(balance >= money){
            balance -= money;
        }else{
            money = balance;
            balance = 0;
        }return money;
    }
}