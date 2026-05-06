import java.util.Scanner;
// Remains to write the program in notes // completed
class OddNumberAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number = ");
        int num = sc.nextInt();
        int sum = OddNumberSum(num);
        System.out.println("sum off odd numbers up to  " + num +
                           " is " +sum);
    }
    public static int OddNumberSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum +i;
            i = i + 2;
        }return sum;
    }
}