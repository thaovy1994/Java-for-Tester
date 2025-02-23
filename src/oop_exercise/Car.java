package oop_exercise;


public class Car extends Vehicle{
    private Integer numSeats;

    Car (String brand, Integer year, Integer numSeats){
        super(brand, year);
        this.numSeats = numSeats;
    }
    @Override
    public void displayInfoAbstract(){}

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand() + ", Year: " + getYear() + ", Doors: " + numSeats);
    }

    public Integer getNumberSeats() {
        return numSeats;
    }
}
