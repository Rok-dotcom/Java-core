import java.util.Scanner;

class AreaofTriagle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle = ");
        double b = input.nextDouble();
        System.out.println("Enter the height of the Triangle = ");
        double h = input.nextDouble();
        double area = (b*h)*(1%2);
        System.out.println("Area of the Triangle is = " +area);
    }
}
