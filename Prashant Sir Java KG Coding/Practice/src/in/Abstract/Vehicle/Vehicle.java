package in.Abstract.Vehicle;

public abstract class  Vehicle {
    private int noOfTires;


    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commit(){
        System.out.println("Going on ....."+noOfTires+"tires");
    }
}
