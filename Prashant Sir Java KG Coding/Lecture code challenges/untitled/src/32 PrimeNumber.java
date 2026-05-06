import java.util.Scanner;
// write down this program in notes // completed
class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Number checker ");
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        boolean isprime = Primecheck(num);
        if(isprime){
            System.out.println("Your number is Prime Number ");
        }else{
            System.out.println("Your number is Not Prime Number ");
        }

    }
    public static boolean Primecheck(int num){
        int i = 2;
        while(i < num){
        if(num % i == 0) {
            return false;
        }i++;
        }return true;
    }
}
