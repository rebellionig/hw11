package bana1.test_12_17.hw;

public class Cat {
    public String name; // Name of the cat
    private int appetite; // Appetite level
    private boolean satiety; // Satiety status

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false; // Initially hungry
    }

    // Method for the cat to eat from the plate
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true; // Cat is satisfied after eating
            System.out.println(name + " ate " + appetite + " units of food.");
        } else {
            System.out.println(name + " could not eat: not enough food.");
        }
    }

    // Method to check the cat's satiety status
    public boolean isSatiety() {
        return satiety;
    }
}
