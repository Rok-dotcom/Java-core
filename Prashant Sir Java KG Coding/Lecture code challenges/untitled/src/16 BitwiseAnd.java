import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to '&' calculator ");
        System.out.print("Enter 1st number = ");
        int first = sc.nextInt();
        System.out.print("Enter your 2nd number = ");
        int second = sc.nextInt();

        double result = first & second;
        System.out.println("Result is " + result);
    }
}
