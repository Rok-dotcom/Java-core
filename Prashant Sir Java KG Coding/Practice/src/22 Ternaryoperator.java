import java.util.Scanner;

class Ternaryoperator {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greater number checker ");
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number : ");
        int num2 = input.nextInt();

//        int greaternumber;
//        if(num1 > num2 ){
//            greaternumber = num1;
//        }else{
//            greaternumber = num2;
//        }
        int greaternumber = num1 > num2 ? num1: num2;
        System.out.println(greaternumber + " is greatest number ");
    }
}
