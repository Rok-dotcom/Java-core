import java.util.Scanner;

class AreaCircumferance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Radius in m: ");
        int r = sc.nextInt();

        // area of the circle
        int area = (int)(Math.PI)*r;
        System.out.println("Area of the circle is "+area+"m^2");

        //circumference of the circle
        int circum = (int) (2* (Math.PI) *r);
        System.out.println("Circumference of the circle = "+circum+"m^2");
    }
}
