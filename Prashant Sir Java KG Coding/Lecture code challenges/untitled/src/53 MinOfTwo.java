import java.util.Scanner;

class MinOfTwoTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Min Of Two Numbers \n ");
        System.out.print("Enter your 1st number = ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number = ");
        int num2 = input.nextInt();
        MinOfTwoTernary ref = new MinOfTwoTernary();
        int min = ref.min(num1, num2);
       }
       public int min(int num1, int num2){
        return num1 < num2 ? num1: num2;
       }
}