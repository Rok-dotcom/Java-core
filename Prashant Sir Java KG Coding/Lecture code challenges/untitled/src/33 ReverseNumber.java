import java.util.Scanner;
// logic of this program is written by me
class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to reverse the number ");
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter the second number = ");
        int b = sc.nextInt();
        System.out.print("Enter the third number = ");
        int c = sc.nextInt();
        System.out.print("Enter the fourth number = ");
        int d = sc.nextInt();

        int e = a;
        a = d;
        d = b;
        b = c;
        c = d;
        d = e;
        System.out.println("Value of a is = " + a);
        System.out.println("Value of b is = " + b);
        System.out.println("Value of a is = " + c);
        System.out.println("Value of b is = " + d);

        //SwapValue(a,b);

    }
//    public static void SwapValue(int a, int b) {
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("Value of a is = " + a);
//        System.out.println("Value of b is = " + b);
    }

