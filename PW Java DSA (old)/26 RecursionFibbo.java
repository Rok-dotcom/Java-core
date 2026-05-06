import java.util.Scanner;

class RecursionFibbo {
    static int fibbonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else
            return fibbonacci(n-1) + fibbonacci(n-2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = fibbonacci(n);
        System.out.println(num);
    }
}
