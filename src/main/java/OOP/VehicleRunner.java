package OOP;

public class VehicleRunner {
    public static void main(String[] args) {
        System.out.println("Running my vehicle example");
        
        Bike bike = new Bike("BMW", "S 1000 RR", 2);
        Car car = new Car("Audi", "A6", 4);

        System.out.println(car.introduction());
        car.start();
        car.openSunroof();
        car.putGroceries();
        car.park();

        System.out.println(bike.introduction());
        bike.start();
        bike.doWheelie();
        bike.splittingLanes();
        bike.park();

    }
}
