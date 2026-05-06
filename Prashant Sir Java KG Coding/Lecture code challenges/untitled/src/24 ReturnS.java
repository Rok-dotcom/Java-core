import java.util.Scanner;

class ReturnS {
    public static void main(String[] args){

        greet();

        int firstnum = number();
        int secondnum = number();

        int sum = firstnum + secondnum;
        System.out.println("sum is = " +sum);

    }
    static int number(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        return num;
    }

    static void greet(){
        System.out.println("Welcome to Calculator ");
    }
}
