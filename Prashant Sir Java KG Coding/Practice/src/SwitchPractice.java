import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

    }public static String Monthchek(int day){
        return switch (day) {
            case 1 -> "january";
            case 2 -> "feb";
            default -> "Enter valid num";
        };
    }
}
