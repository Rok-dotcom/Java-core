import java.util.Scanner;

public class PatternRight {
    public static void main(String[] args) {
        System.out.println("Right hand half pyramid ");
        System.out.print("Enter the rows you want to print : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        PrintPatternRight(rows);
        PrintPatternreverse(rows);

    }
    static void PrintPatternRight(int rows){
        int num = rows;
        for(int i=1; i<=num; num--){
            System.out.println();
            for(int j=1; j<=num-1; j++) {
                System.out.print("  ");
                }
            for(int k=0; k<=(rows- num); k++){
                System.out.print("* ");
            }
        }
    }
    static void PrintPatternreverse(int num){
        System.out.println("Reverse left pattern ");
        int rows = num;
        for(int i=1; i<=num; num--){
            System.out.println();
            for(int j=1; j<=num; j++){
            System.out.print("* ");
            }
        }
    }
}