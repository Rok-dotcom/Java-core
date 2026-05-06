import java.util.Scanner;
// write this program in notes // completed
class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        long num = sc.nextLong();
        long fact = FactorialSum(num);
        System.out.println("Factorial is = " +fact);

    }
    public static long FactorialSum(long num){
        if (num < 2){            // using if function for the < 2 values
            return 1;
        }
        long fact = 1;  // fact is created for the adding the values in this identifier
        long i = 2;
        while(i<=num){
            fact *= i;  // storing the values in fact by multiplying
            i++;
        }return fact;
    }
}
