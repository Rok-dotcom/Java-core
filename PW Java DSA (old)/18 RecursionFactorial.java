import java.util.Scanner;

class RecursionFactorial {

    static int PrintFactorial(int n){
        int fact = 1;
        if(n == 1 || n == 0){
            return 1;
        }else
            return n * PrintFactorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = PrintFactorial(n);
        System.out.println(fact);
    }
}
