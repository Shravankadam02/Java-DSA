package OOP;

public class Vehicle {
    public String Brand;
    public String Model;
    public int noOfTyres;

    Vehicle(String Brand,String Model,int noOfTyres){
        this.Brand = Brand;
        this.Model = Model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine(){
        System.out.println("Engine Started");
    };
    public void stopEngine(){
        System.out.println("Engine Stoped");
    };
}
