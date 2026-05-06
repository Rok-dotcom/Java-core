import java.util.Scanner;

class SumOfOddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator of odd numbers ");
        System.out.println("Enter your number to check sum of odd numbers = ");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd till " + num + " is: " + sum);
    }

    public static int oddSum(int num){
        int sum=0;
        int i = 1;
        while(i<=num) {
            sum+=i;
            i += 2;
        }
        return sum;
    }
}
