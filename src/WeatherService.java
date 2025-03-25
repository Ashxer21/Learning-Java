import java.util.ArrayList;
import java.util.List;

public class WeatherService {
    private List<CityWeather> cities = new ArrayList<>();

    public void addCity(CityWeather city) {
        cities.add(city);
    }


    public CityWeather getCityWeather(String cityName) {
        for (CityWeather city : cities) {
            if (city.getCityName().equalsIgnoreCase(cityName)) {
                return city;
            } else {
                System.out.println("Not Found");
            }
        }
        return null;
    }



    public void displayAllCities() {
        for (CityWeather city : cities) {
            city.displayWeather();
        }
    }


    public void getHottestAndColdestCities() {
        if (cities.isEmpty()) {
            System.out.println("No weather data available.");
            return;
        }

        CityWeather hottest = cities.get(0);
        CityWeather coldest = cities.get(0);

        for (CityWeather city : cities) {
            if (city.getTemperature() > hottest.getTemperature()) {
                hottest = city;
            }
            if (city.getTemperature() < coldest.getTemperature()) {
                coldest = city;
            }
        }

        System.out.println("🔥 Hottest city: " + hottest.getCityName() + " (" + hottest.getTemperature() + "°C)");
        System.out.println("❄ Coldest city: " + coldest.getCityName() + " (" + coldest.getTemperature() + "°C)");
    }
}
