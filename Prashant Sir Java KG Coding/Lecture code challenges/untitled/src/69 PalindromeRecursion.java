import java.util.Scanner;

class PalindromeRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker ");
        System.out.print("Enter your word to Check Palindrome : ");
        String str = sc.next();
        System.out.println("Your word is "+(isPalindrome(str)? "Palindrome "
                                                             :"Not Palindrome "));
    }
    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastpos = str.length() -1;
        if(str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newstr = str.substring(1, lastpos);
        return isPalindrome(newstr);
    }
}