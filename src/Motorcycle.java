public abstract class Motorcycle extends Vehicle{
    private Integer engineCapacity;

    Motorcycle(String brand, Integer year, Integer engineCapacity){
        super(brand, year);
        this.engineCapacity =engineCapacity;
    }
    @Override
    public void displayInfoAbstract(){};
    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + getBrand() + ", Year: " + getYear() + ", Doors: " + engineCapacity);
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }
}
