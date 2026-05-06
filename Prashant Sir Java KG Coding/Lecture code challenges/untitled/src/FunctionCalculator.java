import java.util.Scanner;
public class FunctionCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        greating();
        int a=sc.nextInt();
        int b=sc.nextInt();

       add(a,b);


    }
    static void greating(){

        System.out.println("Hello,Welcome to Calculator:");
    }
    static void add(int a,int b){
         int add = a + b;
        System.out.print(add);
    }
}
