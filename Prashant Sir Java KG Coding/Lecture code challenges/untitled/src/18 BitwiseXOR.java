import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bitwise XOR \n");
        System.out.print("Enter your 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2nd number = ");
        int num2 = sc.nextInt();

        //when only 1^1 = 0 0^0= 0 (when only one 1 then 1 )
        int result = num1 ^ num2;
        System.out.println("Result is " + result );
    }
}
