package UdemyPractice.Classes.CompositionEncapsulationPolymorphism.Polymorphism;

public class Holden extends Car{

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
       return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
    return "Holden -> brake()";

    }

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


}
