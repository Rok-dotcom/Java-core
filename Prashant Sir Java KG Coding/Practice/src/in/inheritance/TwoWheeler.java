package in.inheritance;


import in.inheritance.Vehicle;
public class TwoWheeler extends Vehicle{


    public TwoWheeler(){
//        setNumberOfTires(2);
        numberOfTires = 4;
    }

    public void balance(){
        System.out.println("Balancing the vehicle on two tires ");
    }

}
