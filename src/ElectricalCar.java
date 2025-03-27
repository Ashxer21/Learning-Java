public class ElectricalCar extends Car {
    public ElectricalCar(
            String brand,
            String model,
            int year,
            int maxSpeed,
            double batteryLevel,
            double kilometers
    ) {
        super(brand, model, year, maxSpeed, batteryLevel, kilometers);
    }

    @Override
    public void drive(int km) {
        double batteryConsumption = getFuelConsumption(km, 0.2f);

        if (getFuelLevel() >= batteryConsumption) {
            super.consumeFuelAndDrive(batteryConsumption, km);
        } else {
            System.out.println("⚡ Not enough charge to drive " + km + " km!");
        }
    }

    public void chargeBattery() {
        setFuelLevel(100);
        System.out.println(getModel() + " battery fully charged!");
    }

    @Override
    public void refuel(double liters) {
        chargeBattery();
    }
}
