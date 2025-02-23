public abstract class Vehicle {
    private String brand;
    private Integer year;

    Vehicle(){}
    Vehicle (String brand, Integer year){
        this.brand = brand;
        this.year = year;
    }

    public abstract void displayInfoAbstract();
    public void displayInfo(){
        System.out.println("This is brand " + brand);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year < 0 || year > 2025) {
//            System.out.println("Year is invalid");
            throw new IllegalArgumentException("Year is invalid");
        }
        this.year = year;
    }
}
