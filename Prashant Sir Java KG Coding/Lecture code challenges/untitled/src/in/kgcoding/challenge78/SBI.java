package in.kgcoding.challenge78;

public class SBI {
    public static void main(String[] args){
        Account SBI = new Account("Rohan", 1010);
        SBI.deposite(5000);
        System.out.println(SBI.withdrawmoney(2000));
        System.out.println(SBI.withdrawmoney(4000));
        System.out.println(SBI.deposite(0));
    }
}
