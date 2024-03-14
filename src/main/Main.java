package main;

class Main{
    public static void main(String[] args){
        Car c = new Car("Chevrolet", "Camaro", 1975);
        Motorcycle m = new Motorcycle("MMOI","Side-Car", 2001);
        printGeneralInfo(c);
        printGeneralInfo(m);
    }

    public static void printGeneralInfo(Vehicle v){
        System.out.printf("%s %s %d\n", v.getMake(), v.getModel(),v.getManfYear());
    }

}
