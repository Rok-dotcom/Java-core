//14 Dec 2025
// Question 1: Given a number n, determine if it is prime.
import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        boolean PrimeAns = isPrime(num); // 2 method my and chatGPT
        if(PrimeAns) {
            System.out.println("Given number " + num + " is Prime");
        }else {
            System.out.println("Given number " + num + " is Not Prime");
        }
    }
    public static boolean checkPrime(int num){
        if(num == 1) return false;
        if(num == 2) return true;

        //checking if number is getting divisible by other than itself number

        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i=3; i*i <= n; i+=2){
            if(n % i == 0){
                return false;
            }
        }return true;
    }
}
