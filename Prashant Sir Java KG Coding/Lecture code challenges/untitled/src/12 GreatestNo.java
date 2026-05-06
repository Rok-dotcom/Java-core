import java.util.*;

class GreatestNo {
    public static void main(String[] args) {
        System.out.println("Check your Greatest Number \n\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your 1st Number = ");
        int a = input.nextInt();
        System.out.println("Enter your 2nd Number = ");
        int b = input.nextInt();
        System.out.println("Enter your 3rd Number = ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " Your a number is largest number .");
        } else if (b >= a && b >= c){
            System.out.println(b + " Your b number is largest number  ");
        }
        else {
            System.out.println(c + " Your c number is largest number ");
        }
        System.out.println("Thank you ");
    }
}
