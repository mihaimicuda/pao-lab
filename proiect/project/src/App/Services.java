package App;

import Components.*;

import java.time.LocalDate;
import java.util.*;

public class Services {
    private List<UserConsumer> appUser = new ArrayList<UserConsumer>();
    private List<UserEmployee> appDrivers = new ArrayList<UserEmployee>();
    private List<Restaurant> appRestaurants = new ArrayList<Restaurant>();
    private final ReadServices readServices = new ReadServices();
    
    public void addClient() {
        UserConsumer client = readServices.readClient();
        appUser.add(client);
    }

    public void addClient(UserConsumer client) {
        appUser.add(client);
    }

    public void viewClients() {
        for (var user : appUser) {
            System.out.println(user.toString());
        }
    }

    public void addDriver() {
        UserEmployee driver = readServices.readDriver();
        appDrivers.add(driver);
    }

    public void addDriver(UserEmployee driver) {
        appDrivers.add(driver);
    }

    public void viewDrivers() {
        for (var driver : appDrivers) {
            System.out.println(driver.toString());
        }
    }

    public void addRestaurant() {
        Restaurant restaurant = readServices.readRestaurant();
        appRestaurants.add(restaurant);
    }

    public void addRestaurant(Restaurant restaurant) {
        appRestaurants.add(restaurant);
    }

    public void viewRestaurants() {
        for (var restaurant : appRestaurants) {
            System.out.println(restaurant.toString());
        }
    }

}
