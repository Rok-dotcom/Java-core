package in.kgcoding.challenge87;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int first = input.nextInt();
        System.out.print("Enter your second number : ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.println("Result is " + result);
        }catch (ArithmeticException ex){
            if (ex.getLocalizedMessage().equals("/ by zero")){
                System.out.println("divide by zero is occurred ");
            }else{
                throw ex;
            }
        }

    }
}
