package main;

public interface CarVehicle extends Vehicle {
    void setDoorCount(int d);
    int getDoorCount();
    void setFuelType(String type);
    String getFuelType();

}
