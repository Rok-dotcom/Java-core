public class  Vehicle {
    public static int numberPlate = 7316;
    Vehicle ramesh;
    private String modelName;
    int price;
    String color;
    int engineCC;
    boolean sunRoof;

    Vehicle(String modelName,int price, String color, int engineCC, boolean sunRoof){ // constructor
        this.modelName = modelName;
        this.price = price;
        this.color = color;
        this.engineCC = engineCC;
        this.sunRoof = sunRoof;
    }
    void setmodelName(String modelName){  ///  getter
        if(modelName.length() > 2){
            this.modelName = modelName;
        }
    }
    String getmodelName(){
        return this.modelName;
    }

/*
    public static void main(String[] args){
        Vehicle car = new Vehicle("BMW",1000000,"red",7000,false);
        System.out.println(car.modelName);
        System.out.println(car.ramesh);
        System.out.println(car);
        System.out.println(car.numberPlate);
        car.numberPlate = 3575;
        System.out.println(car.numberPlate);
        System.out.println(Vehicle.numberPlate);  /// by using static keyword
//        System.out.println(Vehicle.modelName());
    }

 */

}


