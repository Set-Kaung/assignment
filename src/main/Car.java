package main;

public class Car implements CarVehicle {
    private String make;
    private String model;
    private int manfYear;
    private int doorCount;
    private String fuelType;

    public Car(String make, String model, int manfYear){
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
    public void setDoorCount(int d) {
        this.doorCount = d;
    }

    @Override
    public int getDoorCount() {
        return this.doorCount;
    }

    @Override
    public void setFuelType(String type) {
       this.fuelType = type;
    }

    @Override
    public String getFuelType() {
       return this.fuelType;
    }
    
}
