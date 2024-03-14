package main;

public interface MotorVehicle extends Vehicle{
    int getNumberOfWheels();
    void setNumberOfWheels(int w);
    String getType();
    void setType(String t);
}