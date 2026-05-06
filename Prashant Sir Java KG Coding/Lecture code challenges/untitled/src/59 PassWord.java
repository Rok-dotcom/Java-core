import java.util.Scanner;

class PassWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to password checker ");

        String password;
        do{
            System.out.print("Enter your password : ");
            password = sc.next();
        }while(!isvalidpass(password));
        System.out.println("You entered valid password ");
    }
    public static boolean isvalidpass(String password){
        return password.length() > 6;
    }
}
