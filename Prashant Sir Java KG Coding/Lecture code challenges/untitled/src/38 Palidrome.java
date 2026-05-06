import java.util.Scanner;

class Palindrome {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Palindrome Checker ");
    System.out.print("Enter your number = ");
    int num = sc.nextInt();
    boolean IsPalindrome = isPalindrome(num);
    if(IsPalindrome){
        System.out.println("your number is Palindrome ");
    }else {
        System.out.println("Your number is not Palindrome ");
    }
}

public static boolean isPalindrome(int num){
    int digit = 0;
    while(num > 0){
        digit = digit * 10 + num % 10;
        if(digit == num){
//        System.out.println("1st digit value is "+digit);
//            System.out.println("num value is "+num);
            return true;
        }num/=10;
    }return false;
  }
}
