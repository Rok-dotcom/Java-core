// fibonacci numbers 0 1 2 3 5 8 13 21
// Question 2: Print the first n terms of the Fibonacci series

import java.util.Scanner;

class Fiboncci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Don't Enter the number : ");
        int n = sc.nextInt();

        fiboNums(n);
        fibboNumUpto(n);
    }
    // this will print fibonacci numbers up to n number
    public static void fiboNums(int n){
        int first = 0, second = 1;
        System.out.print(first+" "+second+" ");
        while(first + second <= n){
            int third = first +second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }



    public static void fibboNumUpto(int n){
        System.out.println();
        int first = 0, second = 1;
        System.out.print(first+" "+second+" ");
        for(int i=1; i<n; i++){
            int third = first + second;
            first = second;
            second = third;
            System.out.print(third+" ");
        }
    }

}

