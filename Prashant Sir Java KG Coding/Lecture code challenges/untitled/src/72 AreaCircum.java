import java.util.Scanner;

class Circle {
    double radius;
    String getAreaOfcircle;
    String getCircumference;

    Circle(double radius){
        this.radius = radius;
    }

    double getAreaOfcircle(){
        return 2 * radius* Math.PI;
    }
    double getCircumference(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "circle : Props radius in mm : "+radius+
                " Area of the circle in mm2 : "+ getAreaOfcircle()+
                " Circumference of the circle in mm : "+getAreaOfcircle();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Circle world ");
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }
}
