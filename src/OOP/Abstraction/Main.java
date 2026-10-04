package OOP.Abstraction;


interface Bird {

    public void fly();

    public void eat();

}

class Sparrow implements Bird{

    @Override
    public void fly(){
        System.out.println(" Sparrow is flying ... ");
    }
    public void eat(){
        System.out.println(" Sparrow is eating ... ");
    }

}

class Parrot implements Bird{
    public void fly(){
        System.out.println("Parrot is flying ...");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating ...");
    }
}
public class Main {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        Parrot p = new Parrot();
        s.eat();
        p.eat();
        s.fly();
        p.fly();
    }
}