import java.util.Scanner;

class GradeTernary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Check grade with your marks ");
        System.out.print("Enter your marks = ");
        int marks = sc.nextInt();
        String Category  = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your Grade is " + Category);
    }
}
