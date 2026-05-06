import java.util.Scanner;

class arthmeticOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator :)");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Value = ");
        double a = input.nextDouble();
        System.out.println("Enter the value Second Value = ");
        double b = input.nextDouble();

        System.out.println("Addition is = " +(a+b));
        System.out.println("Substraction is = " +(a-b));
        System.out.println("Multiplication is = " +(a*b));
        System.out.println("Division is = " +(a/b));
        System.out.println("Modulus is " +(a%b));
    }
}
