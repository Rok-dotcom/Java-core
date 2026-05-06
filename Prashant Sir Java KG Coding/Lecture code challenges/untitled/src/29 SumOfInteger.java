import java.util.Scanner;
// Write this program in notes //completed
class SumOfInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Integer ");
        System.out.print("Please enter the number = ");
        int num = sc.nextInt();
        int sum  = IntegerSum(num);
        System.out.println("Sum of integer is = " +sum);

    }
    // use the Division method Remainder(%) Quotient(/)
    public static int IntegerSum(int num){
        int sum = 0;
        while(0 < num){
            sum += num % 10;
            num/=10;
        }return sum;
    }
}