import java.util.Scanner;

class dowhileAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        do {
            System.out.print("Please enter your age = ");
            age = sc.nextInt();
        }while(age < 0 || age > 100);
        System.out.println("Your age is "+ age);
    }
}
