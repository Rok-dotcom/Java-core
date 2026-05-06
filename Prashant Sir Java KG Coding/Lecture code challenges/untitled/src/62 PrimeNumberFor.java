import java.util.Scanner;

class PrimeNumberFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check Prime Number \n ");
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        boolean IsPrime = isprime(num);
        System.out.println("Your number is " + ((IsPrime)?"Prime ": "Not Prime "));
    }
    public static boolean isprime(int num){
        if (num == 0 || num == 1){
            return false;
        }
        int i;
        for(i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }return true;
    }
}
