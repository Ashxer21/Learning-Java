class SportsCar extends Car {
    private final double acceleration;

    public SportsCar(
            String brand,
            String model,
            int year,
            int maxSpeed,
            double fuelLevel,
            double kilometers,
            double acceleration
    ) {
        super(brand, model, year, maxSpeed, fuelLevel, kilometers);
        this.acceleration = acceleration;
    }

    public void boost() {
        System.out.println(getModel() + " enables turbo mode!");
        System.out.println("Speed increased by 20%!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Acceleration 0-100 km/h: " + acceleration + " sec");
    }
}