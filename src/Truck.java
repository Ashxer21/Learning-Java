class Truck extends Car {
    private int loadCapacity;
    private int currentLoad;

    public Truck(String brand, String model, int year, int maxSpeed, double fuelLevel, double kilometers, int loadCapacity) {
        super(brand, model, year, maxSpeed, fuelLevel, kilometers);
        this.loadCapacity = loadCapacity;
        this.currentLoad = 0;
    }

    public void loadCargo(int weight) {
        if (currentLoad + weight <= loadCapacity) {
            currentLoad += weight;
            System.out.println("🚛 " + getModel() + " loaded: " + currentLoad + " kg");
        } else {
            System.out.println("⚠ Load capacity exceeded!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " kg");
        System.out.println("Current load: " + currentLoad + " kg");
    }
}