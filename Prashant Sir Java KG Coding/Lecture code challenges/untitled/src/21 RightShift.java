import java.util.Scanner;

class RightShift {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LeftShift ");
        System.out.print("Enter your number = ");
        int num = sc.nextInt();

        int result = num >> 1;
        System.out.println("Your left shift is " + result);
    }
}

