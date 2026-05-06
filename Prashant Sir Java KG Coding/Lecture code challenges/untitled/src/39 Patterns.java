import java.util.Scanner;

class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Print patterns ");
        System.out.print("Enter the Rows = ");
        int num = sc.nextInt();
        printlefthandpyramid(num);
        printleftupperhandpyramid(num);
        printrighthandhalfpyramid(num);

    }
    public static void printlefthandpyramid(int num){
        System.out.println(" Left half pyramid ");
        int rows = 1;
        while(rows <= num ){
            System.out.print("*");
            int j = 1;
            while(j < rows){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void printleftupperhandpyramid(int num){
        System.out.println(" Reverse left hand pyramid ");
        int rows = num;
        while(rows >= 0){
            int i = 0;
            while(i < rows){
                System.out.print("* ");
                i++;
            }System.out.println();
            rows--;
        }
    }

    public static void printrighthandhalfpyramid(int num){
        System.out.println("Right hand half pyramid ");
        int rows = num;
        while(rows > 0){
            //this loop prints spaces
            int j = 0;
            while(j < rows -1){
                System.out.print("  ");
                j++;
            }
            //this loop prints star
            int i = 0;
            while(i <= (num - rows)){
                System.out.print("* ");
                i++;
            }System.out.println();
            rows--;
        }
    }
}