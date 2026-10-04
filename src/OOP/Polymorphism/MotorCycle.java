package OOP.Polymorphism;

public class MotorCycle extends Vehicle {
    public String handleType;
    public int noOfGears;

    MotorCycle(String Brand, String Model, int noOfTyres,String handleType,int noOfGears){
        super(Brand,Model,noOfTyres);
        this.handleType = handleType;
        this.noOfGears = noOfGears;
    }

    public void Whellie(){
        System.out.println("Whille is done by" + " " + Brand + " " + Model);
    }
}
