import java.util.Scanner;
class Table {
    public static void main(String[]  args) {
        System.out.println("Welcome to calculator of table ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want = ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
        int i = 1;
        while(i <= 10) {
            System.out.println(num + " X " + i + " = " +(num*i));
             i++;
        }
    }
}
