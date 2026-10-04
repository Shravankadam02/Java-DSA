package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota","Supra",4,5,"Manual","Diesel");

        car1.Specs();
        car1.startEngine();
        car1.Drift();
        car1.stopEngine();
    }
}
