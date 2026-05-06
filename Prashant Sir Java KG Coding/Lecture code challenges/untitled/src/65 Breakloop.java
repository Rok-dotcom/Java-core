import java.util.Scanner;

class Breakloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Break keyword ");
        String word;
        while(true) {
            System.out.print("Enter your word : ");
            word = sc.next();
            if(word.equals("exit")){ //it equals with the actual stored value
                break;                // equalsIgnoreCase :- for lower case and upper case
            }
        }
        System.out.println("You have successfully exited ");
    }
}
