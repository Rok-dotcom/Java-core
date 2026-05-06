import java.util.Scanner;

class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Armstrong Checker ");
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        boolean isarmstrong = isArmstrong(num);
        if(isarmstrong){
            System.out.println("Your number is Armstrong ");
        }else{
            System.out.println("Your number is not armstrong ");
        }

    }
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numcopy = num;
        int finalDigit = 0;
        while(num > 0 ){
            int lastdigit = num % 10;
            num /= 10;
            finalDigit += pow(lastdigit,noOfDigits);
        }return finalDigit == numcopy;


    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *= num1;
            i++;
        }return result;
    }


    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num/=10;
        }return digits;
    }
}
