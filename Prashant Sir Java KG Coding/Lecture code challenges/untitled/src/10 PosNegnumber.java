import java.util.Scanner;

class PosNegnumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Check the num");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number = ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("Your num is Zero ");
        } else if (num < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("your num is Positive ");
        }
        }
    }