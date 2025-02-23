package oop_exercise;

public abstract class Bicycle extends Vehicle {
    private Boolean hasGear ;

    Bicycle(String brand, Integer year, Boolean hasGear){
        super(brand, year);
        this.hasGear = hasGear;
    }
    @Override
    public void displayInfoAbstract(){};
    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand() + ", Year: " + getYear() + ", Doors: " + hasGear);
    }

    public Boolean getHasGear() {
        return hasGear;
    }
}
