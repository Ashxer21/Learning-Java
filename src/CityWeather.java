

public class CityWeather {
    private String cityName;
    private double temperature;
    private int humidity;
    private String weatherCondition;
    private double windSpeed;
    private int presure;


    public CityWeather(String cityName, double temperature, int humidity, String weatherCondition, double windSpeed, int presure) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherCondition = weatherCondition;
        this.windSpeed = windSpeed;
        this.presure = presure;
    }

    public void displayWeather() {
        System.out.println(cityName + " - " + weatherCondition);
        System.out.println("🌡 Temperature: " + temperature + "°C");
        System.out.println("💧 Humidity: " + humidity + "%");
        System.out.println("💨 Wind Speed: " + windSpeed + " m/s");
        System.out.println("⚖ Pressure: " + presure + " hPa");
        System.out.println("-----------------------------");
    }

    public void compareTemperature(CityWeather otherCity) {
        if (this.temperature > otherCity.temperature) {
            System.out.println(this.cityName + " is warmer than " + otherCity.cityName + ".");
        } else if (this.temperature < otherCity.temperature) {
            System.out.println(this.cityName + " is colder than " + otherCity.cityName + ".");
        } else {
            System.out.println("Both cities have the same temperature.");
        }
    }

    public boolean isStormComing() {
        return windSpeed > 10 && presure < 1000;
    }

    public double feelsLikeTemperature() {
        return temperature - (windSpeed * 0.2);
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }
}
