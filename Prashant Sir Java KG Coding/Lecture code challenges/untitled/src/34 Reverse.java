import java.util.Scanner;
// learn this program and write down in the notes
class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Reverse number ");
        System.out.print("Enter your number ");
        int num = sc.nextInt();
        int value = Reverse(num);
        System.out.println("Reverse number is = " +value);

    }
    public static int Reverse(int num){
        int newnum = 0;
        while(num > 0){
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }return newnum;
    }
}
