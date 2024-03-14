package main;

class Main{
    public static void main(String[] args){
        Car c = new Car("Chevrolet", "Camaro", 1975);
        System.out.printf("%s %s %d\n", c.getMake(), c.getModel(),c.getManfYear());
    }
}
