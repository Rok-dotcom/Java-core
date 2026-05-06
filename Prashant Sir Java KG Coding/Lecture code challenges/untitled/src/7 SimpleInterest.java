import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculate simple Interest\n\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Principle = ");
        double p = input.nextDouble();
        System.out.println("Enter the value of Year = ");
        double t = input.nextDouble();
        System.out.println("Enter the value of Rate = ");
        double r = input.nextDouble();

        double simpint = (p*t*r)/100;
        System.out.println("Total Simple Interest is = " +simpint);

    }
}
