public class ElectricalCar extends Car {
    public ElectricalCar(String brand, String model, int year, int maxSpeed, double batteryLevel, double kilometers) {
        super(brand, model, year, maxSpeed, batteryLevel, kilometers);
    }

    @Override
    public void drive(int km) {
        double batteryConsumption = km * 0.2;
        if (getFuelLevel() >= batteryConsumption) {
            super.drive(km);
        } else {
            System.out.println("⚡ Not enough charge to drive " + km + " km!");
        }
    }

    public void chargeBattery() {
        super.setFuelLevel(100);
        System.out.println(getModel() + " battery fully charged!");
    }


    public void refuel() {
        chargeBattery();
    }
}
