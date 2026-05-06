import java.util.Scanner;

class Arthmaticswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to to the simple calculator \n");
        System.out.print("Enter the operation symbol you want to do = \n ");
        char sign = sc.next().charAt(0);
        System.out.print("Enter your 1st number \n");
        int n1 = sc.nextInt();
        System.out.print("Enter your 2nd number \n");
        int n2 = sc.nextInt();
        int calis = Arthmaticop(sign,n1,n2);
        System.out.println("Your " + sign + " is "+ calis);
    }
    public static int Arthmaticop(char sign ,int n1, int n2){
        return switch (sign){
            case '+' -> n1+n2;
            case '-' -> n1-n2;
            case '*' -> n1*n2;
            case '/' -> n1/n2;
            default -> 0;
        };
    }
}
