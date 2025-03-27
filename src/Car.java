import java.util.List;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final int maxSpeed;
    private double fuelLevel;
    private final double kilometers;

    public Car(
            String brand,
            String model,
            int year,
            int maxSpeed,
            double fuelLevel,
            double kilometers
    ) {
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
        double fuelConsumption = getFuelConsumption(km, 0.1f);
        consumeFuelAndDrive(fuelConsumption, km);
    }

    protected double getFuelConsumption(int kilometers, float consumption) {
        return kilometers * consumption;
    }

    protected void consumeFuelAndDrive(double fuelConsumption, int kilometers) {
        if (fuelLevel >= fuelConsumption) {
            fuelLevel -= fuelConsumption;
            kilometers += kilometers;
            System.out.println(model + " traveled " + kilometers + " km. Fuel remaining: " + fuelLevel + " liters");
        } else {
            System.out.println("⛽ Not enough fuel to drive " + kilometers + " km!");
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

    protected double getFuelLevel() {
        return fuelLevel;
    }
}