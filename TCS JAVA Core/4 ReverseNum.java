//15 dec 2025
// Question 4: Reverse a given number

import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        input.close();
        System.out.print("Num before : "+n);
        System.out.println();
        reverse(n);


    }
    static void reverse(int n){
        if(n < 10){
            System.out.print(n);
        }
        int LastNum;
        int rev = 0;
        while(n > 0){
            LastNum = n%10;
            rev = rev * 10 + LastNum;
            n /= 10;
        }
        System.out.print("Num after : "+rev);
    }
}
