import java.util.Scanner;

class Guessing {

    int random ;
    Guessing(){
        random = (int) Math.ceil(Math.random() * 100);
    }
    /**
     * @param guessenumber Player that guess number
     * @return -
     * - if guessed number is less
     * - 0 if guessed number is correct
     * - positive number if guessed number is higher
     */

    int guess(int guessenumber ){
        return guessenumber - random;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number guessing game \n");
        System.out.print("Guess the number : ");
        Guessing game = new Guessing();
        int guess;
        int result;
        do{
            guess = sc.nextInt();
            result = game.guess(guess);
            if(result < 0){
                System.out.println("Please guess the higher number: ");
            }else if (result > 0){
                    System.out.println("Please guess the smaller number: ");
            }else if(result == 0){
                System.out.println("Your guess is correct: ");
            }
        }while(result != 0);
    }
}