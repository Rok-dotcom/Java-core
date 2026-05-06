import java.util.Scanner;

class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to EvenOdd checking by Bitwise ");
        System.out.print("Enter your number = ");
        int num = sc.nextInt();

        // Every even last number is 0 in binary

        // multiplying binary by 0001 i.e 0101*0001=

        if((num & 1) == 1) {
            System.out.println("Your number is Odd ");
        }else {
            System.out.println("Your number is Even ");
        }
    }
}
