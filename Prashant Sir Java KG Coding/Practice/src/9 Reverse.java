import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the GCM finder = ");
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int reversed = reverse(num);
        System.out.println("Reversed number is  = " +reversed);

    }
    public static int reverse(int num){
        int sum = 0;
        while(0<num){
            sum = num % 10;
            num/=10;
        }return sum;
    }
}
