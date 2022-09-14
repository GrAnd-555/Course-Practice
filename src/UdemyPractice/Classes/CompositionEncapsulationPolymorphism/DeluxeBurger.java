package UdemyPractice.Classes.CompositionEncapsulationPolymorphism;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "bacon", 14.54, "brown roasted");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
//For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters.
// Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10.
// The constructor can be configured in any way, as long as chips and drink are added for the total price just mentioned.
// In this class, the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden
// so that a message is printed stating that no additional items can be added to a deluxe burger.
//