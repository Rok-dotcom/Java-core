import java.util.Scanner;

public class ValidPass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.print("Enter your password : ");
            pass = sc.next();
        }while(!validpass(pass));
        System.out.print("your pass is set successfully : "+pass);
    }
    public static boolean validpass(String pass){
        return pass.length() > 6;
    }
}
