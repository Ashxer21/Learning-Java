import java.util.List;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int maxSpeed;
    private double fuelLevel;
    private double kilometers;

    public Car(String brand, String model, int year, int maxSpeed, double fuelLevel, double kilometers) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.fuelLevel = fuelLevel;
        this.kilometers = kilometers;
    }

    public void displayInfo() {
        System.out.println("🚗 " + brand + " " + model + " (" + year + ")");
        System.out.println("   Max Speed: " + maxSpeed + " km/h");
        System.out.println("   Fuel Level: " + fuelLevel + " liters");
        System.out.println("   Kilometers: " + kilometers + " km");
    }

    public void drive(int km) {
        double fuelConsumption = km * 0.1;
        if (fuelLevel >= fuelConsumption) {
            fuelLevel -= fuelConsumption;
            kilometers += km;
            System.out.println(model + " traveled " + km + " km. Fuel remaining: " + fuelLevel + " liters");
        } else {
            System.out.println("⛽ Not enough fuel to drive " + km + " km!");
        }
    }

    public static void displayAllCars(List<Car> cars) {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }

        System.out.println("🚗 List of all cars:");
        for (Car car : cars) {
            car.displayInfo();
            System.out.println("-------------------------");
        }
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = Math.max(0, Math.min(100, fuelLevel));
    }

    public void refuel(double liters) {
        fuelLevel = Math.min(100, fuelLevel + liters);
        System.out.println(model + " refueled. Current fuel level: " + fuelLevel + " liters");
    }

    protected String getModel() {
        return model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getKilometers() {
        return kilometers;
    }
}