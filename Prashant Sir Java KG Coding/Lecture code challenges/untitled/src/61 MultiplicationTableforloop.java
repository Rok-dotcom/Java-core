import java.util.Scanner;

class MultiplicationTableforloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to get Table which you want ");
        System.out.print("Enter the number which you want the table = ");
        int num = sc.nextInt();
        Table(num);
    }
    public static void Table(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(i+ " X "+num+" = "+ (i*num));
        }
    }
}
