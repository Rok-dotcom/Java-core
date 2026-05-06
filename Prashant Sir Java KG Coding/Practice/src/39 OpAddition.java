import java.util.Scanner;

class OpAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number :");
        double first = sc.nextDouble();
        System.out.print("Enter the 2nd number :");
        double second = sc.nextDouble();
        System.out.print("Enter the Operator symbol which operation do you want to perform : ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("Addition is : "+(first + second));
                break;
            case '-':
                System.out.println("subtraction is : "+(first - second));
                break;
            case '*':
                System.out.println("multiplication is : "+(first * second));
                break;
            case '/':
                System.out.println("division is : "+(first / second));
                break;
            default:
                System.out.println("Enter the valid operator ");
                break;
        }
    }
}
