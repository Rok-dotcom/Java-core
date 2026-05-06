package in.kgcoding.challenge77.calculator;

import in.kgcoding.challenge77.geometry.Circle;
import in.kgcoding.challenge77.geometry.Rectangle;

public class Area {
    public static void main(String[] args){
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(7,5);

        double cirarea = Math.PI*(Math.pow(cir.radius,2));
        double rectarea = rect.length*rect.breadth;

        System.out.printf("Area of the circle is %f , Area of the rectangle is %f ",cirarea, rectarea);
    }
}
