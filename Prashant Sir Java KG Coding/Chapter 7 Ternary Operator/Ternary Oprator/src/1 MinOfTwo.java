import java.util.Scanner;

class MinOfTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Min Of Two Numbers \n ");
        System.out.print("Enter your 1st number = ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number = ");
        int num2 = input.nextInt();
        int Minimumno =(num1 < num2) ? num1:num2;
        System.out.println(Minimumno + " is Minimum Number ");

    }
}
