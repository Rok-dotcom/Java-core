import java.util.Scanner;

class BitwiseOR {
    public static void main(String[] arges)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Even Odd checker ");
        System.out.print("Enter your 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2nd number = ");
        int num2 = sc.nextInt();

        int result = num1 | num2;
        System.out.println("Result is " + result);
    }
}
