package in.kgcoding.challenge83;

public class TestShapes {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Square square = new Square(10.2);

        System.out.printf("Area of the Circle is %5.2f \n",circle.calculateArea());
        System.out.printf("Area of the Square is %5.2f\n", square.calculateArea());
    }
}
