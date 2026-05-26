public class car1 {
    public static void main(String[] args){
        Vehicle car2 = new Vehicle("Audi",500000,"Black",5000,true);
        car2.setmodelName("BMW");      // setter
        System.out.println(car2.getmodelName()); // getter
        System.out.println(car2.price);
        System.out.println(car2.color);
        System.out.println(car2.engineCC);
        System.out.println(car2.sunRoof);
        System.out.println(car2.numberPlate);
        System.out.println(Vehicle.numberPlate);
    }
}
