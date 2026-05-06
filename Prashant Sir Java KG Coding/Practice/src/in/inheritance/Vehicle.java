package in.inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setVehicle(int numberofTires){
        this.numberOfTires = numberofTires;
    }

    public String toString(){
        return "Number of Tires to the vehicles "+numberOfTires;
    }

    public void commut(){
        System.out.printf("Vehicle moving from place A to place B on %d ", numberOfTires);
    }
}
