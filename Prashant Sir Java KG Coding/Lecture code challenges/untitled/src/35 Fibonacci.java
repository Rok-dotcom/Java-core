import java.util.Scanner;
// this program is done by mayur
class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        //int fib=fib(num);
        for(int i=0;i<num;i++){
            System.out.println(fib(i));
        }

    }
    public static int fib(int n){
        if(n==0 || n==1)return n;
        return fib(n-1)+fib(n-2);
 }
}

