package bana1.test_12_17.hw;

public class lect11 {
    public static void main(String[] args) {
        // Create a plate with a maximum capacity of 10 units
        Plate plate = new Plate(10, 5);

        // Create an array of cats
        Cat[] cats = {
                new Cat("Whiskers", 4),
                new Cat("Mittens", 3),
                new Cat("Shadow", 5)
        };

        // Ask each cat to eat from the plate
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        // Print each cat's satiety information
        for (Cat cat : cats) {
            System.out.println(cat.name + " satiety: " + cat.isSatiety());
        }

        // Show remaining food in the plate
        System.out.println("Remaining food in the plate: " + plate.getCurrentAmount());
    }
}