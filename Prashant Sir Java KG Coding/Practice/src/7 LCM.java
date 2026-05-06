import java.util.Scanner;

class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM ");
        System.out.println("Enter the first number = ");
        int first = sc.nextInt();
        System.out.println("Enter the second value = ");
        int second = sc.nextInt();
        int factor = LCM(first,second);
        System.out.println("LCM of the number is = " +factor);

    }
    public static int LCM(int first, int second){
        int i = 1;
        while( i <= second ){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }i++;
        }return 0;
    }

}

