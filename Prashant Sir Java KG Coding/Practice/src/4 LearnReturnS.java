import java.util.Scanner;

class LearnReturnS {
    public static void main(String[] args){
        greet();
        EvenOdd();
    }
    public static void EvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check it is Even OR Odd = \n ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Your number is Even ");
        }else {
            System.out.println("Your number is Odd ");
        }
    }
    public static void greet(){
        System.out.print("Welcome to check Return function \n\n ");
    }
}
