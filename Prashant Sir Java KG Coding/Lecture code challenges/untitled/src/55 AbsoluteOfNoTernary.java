import java.util.Scanner;

class AbsoluteOfNoTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the See Absolute of the given number ");
        System.out.print("Enter your Absolute number = ");
        int num = input.nextInt();

        int posnum = num <= 0 ? -num: num;
        System.out.println("Absolute value is " +posnum);
        //int result = num + (-num * 2);0

        //System.out.println("Your Positive number is "+ result);
    }
}
