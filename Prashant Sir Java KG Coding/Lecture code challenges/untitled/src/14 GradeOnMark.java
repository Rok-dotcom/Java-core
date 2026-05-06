import java.util.Scanner;

class GradeOnMark {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check your grade ");
        System.out.println("Enter your Marks = ");
        int marks = input.nextInt();

     //using >= and <= sign to compare the values

        if(marks >= 90 ) {
            System.out.println("Your grade is A ");
        }else if(marks >= 75) {
            System.out.println("Your grade is B ");
        }else if (marks >= 60) {
            System.out.println("Your grade is C ");
        }else if (marks >= 30) {
            System.out.println("Your grade is D ");
        }else if (marks <30) {
            System.out.println("Your grade is F ");
        }else {
            System.out.println("Please enter valid marks ");
        }
    }
}
