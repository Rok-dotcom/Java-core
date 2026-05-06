import java.util.Scanner;
// write this code into the notes // completed
class GCM {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the GCM calculator ");
        System.out.print("Enter the first number = ");
        int first = sc.nextInt();
        System.out.print("Enter the second number = ");
        int second = sc.nextInt();
        int factor = GCM(first,second);
        System.out.println("factor is " +factor);
    }
    public static int GCM(int first, int second){
        int leastnum = Least(first,second);
        int i = leastnum;                         // calling another method from this method
        while(i <= leastnum){
            if(first % i == 0 && second % i ==0){
                return i;
            }i--;
        } return 0;
    }

    public static int Least(int num1 , int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}