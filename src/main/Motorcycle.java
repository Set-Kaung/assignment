package main;

public class Motorcycle implements MotorVehicle {
    private String make;
    private String model;
    private int manfYear;
    private int wheels;
    private String type;
    
    public Motorcycle(String make, String model, int manfYear){
        this.make = make;
        this.model = model;
        this.manfYear = manfYear;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
       return this.model;
    }

    @Override
    public int getManfYear() {
       return this.manfYear;
    }

    @Override
    public int getNumberOfWheels() {
      return this.wheels;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setNumberOfWheels(int w) {
       this.wheels = w;
    }

    @Override
    public void setType(String t) {
        this.type = t;
    }
    
}
