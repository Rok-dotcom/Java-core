package ReturnObj.Vehicle;
// Leetcode 17 june 2026.
import java.util.ArrayList;
import java.util.List;

public class car {
    public static void main(String[] args){
        vehicle car1 = new vehicle();
        car1.setModelName("Tata Harrier");
        car1.setPrice(2500000);
        car1.setColor("Black");

        vehicle car2 = new vehicle();
        car2.setModelName("Ford");
        car2.setPrice(5000000);
        car2.setColor("white");

        vehicle car3 = new vehicle();
        car3.setModelName("Innova");
        car3.setPrice(3000000);
        car3.setColor("gray");

        vehicle car4 = new vehicle();
        car4.setModelName("Duster");
        car4.setPrice(2500000);
        car4.setColor("coral");

        List<vehicle> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        List<vehicle> car = getCar(cars);
        for(vehicle c : car){
            System.out.println();
            System.out.println(c.getModelName());
            System.out.println(c.getPrice());
            System.out.println(c.getColor());
        }
        System.out.println(car1.toString());


        // now I want to black car which is 2500000 price

    }
    public static List<vehicle> getCar(List<vehicle> cars){
        List<vehicle> carList = new ArrayList<>();
        for(vehicle c: cars){
            if(c.getPrice()>=2500000 && c.getPrice()<=3000000){
                carList.add(c);
            }
        }
        return carList;
    }
}
