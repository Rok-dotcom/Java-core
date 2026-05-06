import java.util.Scanner;
class AgeGroup {

    public static void main(String[] args) {
        System.out.println("Know your Age Group ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = sc.nextInt();

        if (age >=65) {
            System.out.println("You are Senior ");
        } else if (age >=20) {
            System.out.println("You are Adult ");
        } else if (age >=13) {
            System.out.println("You are Teen ");
        } else if (age >=1) {
            System.out.println("You are Child ");
        } else {
            System.out.println("I think you are Superman ");
      }
    }
}

