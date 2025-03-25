public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();

        CityWeather kyiv = new CityWeather("Kyiv", 18.5, 60, "Sunny", 5.5, 1002);
        CityWeather lviv = new CityWeather("Lviv", 22.1, 10, "Cloudy", 1.0, 1001);
        CityWeather tokyo = new CityWeather("Tokyo", 30.8, 87, "Sunny", 1, 1002);

        weatherService.addCity(kyiv);
        weatherService.addCity(lviv);
        weatherService.addCity(tokyo);


        weatherService.displayAllCities();

        kyiv.compareTemperature(tokyo);

        System.out.println("Is storm coming in Tokyo? " + (tokyo.isStormComing() ? "Yes! ⚠" : "No 😊"));

        System.out.println("Kyiv feels like: " + kyiv.feelsLikeTemperature() + "°C");

        weatherService.getHottestAndColdestCities();
    }
}