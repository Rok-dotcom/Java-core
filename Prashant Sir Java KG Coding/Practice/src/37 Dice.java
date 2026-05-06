import java.util.Scanner;

class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice = 0;
        do {
            System.out.print("Enter 1 to throw the dice = ");
            int r = sc.nextInt();
            if (r == 1){
                dice = (int) Math.round((Math.random() * 10));
            }
            }while (dice >= 6) ;
            System.out.println(dice);
        }
    }

