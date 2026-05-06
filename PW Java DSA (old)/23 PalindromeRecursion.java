import java.util.Scanner;
// chatgpt problem
class PalindromeRecursion {

    //method for reverse the integer
    static int reverse(int num, int rev){
        if(num == 0){
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }
    static boolean CheckPalindrome(int num){
        return num == reverse(num,0);
        }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your num");
        int n = in.nextInt();
        System.out.println(CheckPalindrome(n));
    }
}
