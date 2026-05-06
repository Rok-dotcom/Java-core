import java.util.Scanner;

class ProductFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of First Number = ");
        float a = input.nextFloat();
        System.out.println("Enter the value of Second Number = ");
        float b = input.nextFloat();
        float ans = a*b;
        System.out.println("Product of two numbers = " +ans);
    }
}
