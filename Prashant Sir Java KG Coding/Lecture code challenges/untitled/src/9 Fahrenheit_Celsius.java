import java.util.Scanner;

class Fahrenheit_Celsius {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator of Fahrenheit to Celsius \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit = ");
        int f = input.nextInt();

        int c = ((f - 32)*(5%9));
        System.out.println("Converted temperature Fahrenheit to Celsius = " +c+ " c");
    }
}
