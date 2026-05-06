package in.Abstract.Vehicle;

public class Car extends Vehicle{
    private int noOfdoor;

    public Car(int noofdoor) {
        super(4);
        this.noOfdoor = noOfdoor;
    }
    public void noOfD(){
        System.out.println("Number of door to the car "+noOfdoor);
    }
}
