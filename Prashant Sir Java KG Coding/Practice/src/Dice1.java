import java.util.Scanner;

public class Dice1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1 to start :");
        int dice = sc.nextInt();
        randomdice(dice);

    }
    static void randomdice(int dice){
        for (int i = 0; i < 10; i++) {
            int randomnum = (int)Math.ceil(Math.random()*10);
            System.out.println(randomnum);
        }

    }
}
