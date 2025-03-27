import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        SportsCar audi = new SportsCar("Audi", "RS6-GT", 2024, 320, 80, 500, 2.8);
        SportsCar porsche = new SportsCar("Porsche", "911-GT3RS", 2021, 300, 60, 700, 3.4);
        Car skoda = new Car("Skoda", "Kodiaq", 2022, 240, 50, 1000);
        Truck ford = new Truck("Ford", "Transit-Long", 2000, 150, 90, 20000, 2000);
        ElectricalCar audi2 = new ElectricalCar("Audi", "E-TRON-GT", 2023, 250, 80, 15000);


        cars.add(audi);
        cars.add(porsche);
        cars.add(skoda);
        cars.add(ford);
        cars.add(audi2);


        Car.displayAllCars(cars);

        System.out.println("\n🔹 Testing truck loading:");
        ford.loadCargo(500);
        ford.loadCargo(700);
        ford.loadCargo(900);

        ford.displayInfo();

        System.out.println("\n=== Driving Cars ===");
        audi.drive(50);
        porsche.drive(30);
        skoda.drive(100);
        ford.drive(80);
        audi2.drive(60);


        System.out.println("\n=== Refueling / Charging ===");
        audi.refuel(20);
        porsche.refuel(15);
        skoda.refuel(30);
        ford.refuel(40);
        audi2.chargeBattery();


        System.out.println("\n=== Updated Car Info ===");
        Car.displayAllCars(cars);
    }
}