import java.util.Scanner;

class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing of compliment "); // it works like not means opposite to the i/p
        System.out.print("Enter your number = ");
        int num = sc.nextInt();

        // 0101 = 1010
        int result = ~num;
        System.out.println("Result is " + result);
    }
}
