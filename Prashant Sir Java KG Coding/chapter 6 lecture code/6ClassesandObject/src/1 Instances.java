class Car {

    String colour ;
    int NoOfWheels ;
    int MaxSpeed ;
    int CurrentFuelInLiters ;
    int NoOfSeats;
    public void drive() {
        if (CurrentFuelInLiters == 0){
            System.out.println("Your car is out of fuel ");
        }else if(CurrentFuelInLiters < 5){
            System.out.println("Your car is in reserved mode ");
            CurrentFuelInLiters--;
        }else{
            System.out.println("Car is driving ");
            CurrentFuelInLiters--;
        }
    }

    public void addfuel(float fuel){
        CurrentFuelInLiters += fuel;
    }

    public float getfuellevel(){
        return CurrentFuelInLiters;
    }
}

