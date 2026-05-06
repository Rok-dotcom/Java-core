import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Welcome to check num is Even or Odd ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number = ");
        int num = input.nextInt();

        if(num %2==0) {
            System.out.println("Number is Even ");
        } else {
            System.out.println("Number is Odd ");
        }
    }
}
