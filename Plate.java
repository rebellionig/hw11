package bana1.test_12_17.hw;

public class Plate {
    private int maxAmount; // Maximum amount of food the plate can hold
    private int currentAmount; // Current amount of food in the plate
    private int volume; // Volume of the plate
    private boolean full; // Whether the plate is full

    public Plate(int maxAmount, int volume) {
        this.maxAmount = maxAmount;
        this.currentAmount = maxAmount; // Initially full
        this.volume = volume;
        this.full = true;
    }

    // Method to add food into the plate
    public void addFood(int amount) {
        if (currentAmount + amount <= maxAmount) {
            currentAmount += amount;
            if (currentAmount == maxAmount) {
                full = true;
            }
        } else {
            System.out.println("Cannot add food: Plate will overflow.");
        }
    }

    // Method to decrease food quantity
    public boolean decreaseFood(int amount) {
        if (currentAmount >= amount) {
            currentAmount -= amount;
            return true; // Successfully ate food
        } else {
            return false; // Not enough food
        }
    }

    // Method to check the current amount of food
    public int getCurrentAmount() {
        return currentAmount;
    }
}
