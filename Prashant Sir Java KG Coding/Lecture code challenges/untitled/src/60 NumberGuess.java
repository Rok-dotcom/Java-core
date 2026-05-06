import java.util.Scanner;

class NumberGuess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing game \n ");

        int randnum = 7 , num;
        do{
            System.out.print("Enter your number : ");
            num = sc.nextInt();
        }while(num != randnum );
        System.out.println("You guessed right number ");
    }
}