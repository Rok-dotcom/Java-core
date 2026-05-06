import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Compound Interest Calculator ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Principle = ");
        double p = input.nextDouble();
        System.out.println("Enter the value of Year = ");
        double t = input.nextDouble();
        System.out.println("Enter the value of Rate = ");
        double r = input.nextDouble();

        double compint = p * Math.pow( (1 + r / 100), t);
        System.out.println("Total compound interest RS = " +compint);

    }
}
