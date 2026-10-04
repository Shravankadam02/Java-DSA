package OOP.Polymorphism;

public class Car extends Vehicle {

    public int noOfDoors;
    public String transmissionType;
    public String fuelType;

    Car(String Brand, String Model, int noOfTyres,int noOfDoors,String transmissionType,String fuelType) {
        super(Brand, Model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
    }

    public void Specs(){
        System.out.println(Model + " "
                + Brand + " "
                +noOfTyres + " "
                +noOfDoors + " "
                +transmissionType + " "
                +fuelType);
    }

    public void Drift(){
        System.out.println("Drifting is Done By"+ " " + Brand + " " + Model);
    }


}
