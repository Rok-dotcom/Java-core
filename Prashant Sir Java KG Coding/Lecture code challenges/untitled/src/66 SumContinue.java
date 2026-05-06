import java.util.Scanner;

class SumContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition of only Positive numbers ");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for(int n : arr){
            if(n < 0){
                continue;
            }
            sum += n;
        }
        System.out.println("Sum of positive number is " +sum);
    }
}