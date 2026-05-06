import java.util.Scanner;

class Fibonacci1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci number ");
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        fibocheck(num);
    }
    public static void fibocheck(int num){
        if(num<0) {
            return;
        }System.out.print("0 ");
        if(num==1){
            return;
        }System.out.print("1 ");


        int first = 0; int second = 1;
        while(first + second  <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second ;
            second = third;
        }
    }
}
