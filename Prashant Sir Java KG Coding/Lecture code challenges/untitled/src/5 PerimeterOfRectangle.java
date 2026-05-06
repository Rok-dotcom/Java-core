import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Dimensions of the Rectangle :");
        System.out.println("Enter the value of a = ");
        int a = input.nextInt();
        System.out.println("Enter the value of b = ");
        int b = input.nextInt();
        System.out.println("Enter the value of c = ");
        int c = input.nextInt();
        System.out.println("Enter the value of d = ");
        int d = input.nextInt();

        int peri = a+b+c+d;
        System.out.println("Perimeter of the Rectangle is = " +peri);
    }
}
