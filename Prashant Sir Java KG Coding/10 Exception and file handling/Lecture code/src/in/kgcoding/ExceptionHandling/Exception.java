package in.kgcoding.ExceptionHandling;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator ");
        System.out.print("Enter the first value : ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Division is %d ", result);
        } catch (ArithmeticException Exception){
            System.out.printf(" %s , please enter valid input",Exception.getMessage());
        }

    }
}
