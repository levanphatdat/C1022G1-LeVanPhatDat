package ss7_Abstract_Class_and_Interface.thuc_hanh.AnimalAndAnimalEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cl-cl";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
