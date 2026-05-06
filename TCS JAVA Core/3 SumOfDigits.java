// Question 3: Given an integer, find the sum of its digits.

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int n = input.nextInt();
        System.out.print(NoOfDigits(n));
        System.out.println();
        System.out.print(Sum(n));

    }
    public static int Sum(int n){
        int sum = 0;
        while(n > 0){


            sum += n%10; // Get last digit
            n /= 10;     // remove last digit
        }
        return sum;
    }

//    this method return sum
    public static int sum(int n){
        int digit = n;
        int digits = NoOfDigits(n);
        int sum = 0;
        while(digits > 0){
            digit = digit % 10;
            sum = sum * 10 + digit;
            digit /= 10;
            digits--;
        }

        return sum;
    }


//    This return No Of Digits are presents in integer
    static int NoOfDigits(int n){
        int digit = 0;
        while(n > 0){
            n = n/10;
            digit++;
        }
        return digit;
    }
}







