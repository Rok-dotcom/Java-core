package in.kgcoding.BankAccount;

public class SBI {
    private double AccNumber ;
    private String AccHolderName;
    private int balance;
    private int deposites;

    public int deposites(int deposite) {
        this.deposites = deposite;
        this.balance = this.deposites;
        return 0;
    }

    public int withdraw(int amount){
        this.balance = balance - amount;
        if (this.balance < 5000){
            System.out.println(deposites);
            System.out.println(this.balance);
            System.out.println("Sorry insufficient balance ");
        }else{
            System.out.println("Cash withdraw "+amount);
            System.out.println("Remaining balance "+ this.balance);
        }return 0;
    }
    public static void main(String[] args ){
        SBI sbi = new SBI();

        sbi.deposites(10000);
        System.out.println(sbi.withdraw(2000));
        System.out.println(sbi.withdraw(2000));
        System.out.println(sbi.withdraw(2000));
    }
}
