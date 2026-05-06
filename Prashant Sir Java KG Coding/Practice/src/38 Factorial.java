import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int fact = 1;
        for(int i = 2; i<=num; num--){
            fact *= num;
        }
        System.out.println(fact);
    }
}
