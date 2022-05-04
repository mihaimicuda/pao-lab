package App;

import Components.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Services {
    private static Services servicesInstance = null;

    private final ReadServices readServices = ReadServices.getInstance();

    private List<UserConsumer> appUser = new ArrayList<UserConsumer>();
    private List<UserEmployee> appDrivers = new ArrayList<UserEmployee>();
    private List<LocalDateTime> driversAvailability = new ArrayList<LocalDateTime>();
    private List<Restaurant> appRestaurants = new ArrayList<Restaurant>();

    public static Services getInstance() {
        if (servicesInstance == null)
            servicesInstance = new Services();
        return servicesInstance;
    }

    public final void showMenu() {
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("# # # # #   Welcome to out delivery platform console App   # # # # #");
        System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
        System.out.println("    Here are the options that we have implemented at this moment : ");
        System.out.println("1. Add a user of the app.");
        System.out.println("2. Add an employee of the app.");
        System.out.println("3. Add a restaurant for the app.");
        System.out.println("4. Show user list of the food delivery app.");
        System.out.println("5. Show employee list of the app.");
        System.out.println("6. Show restaurants.");
        System.out.println("7. Push a Food Order");
        System.out.println("8. Show the users that ordered today.");
        System.out.println("9. Show top 3 users that have ordered most times.");
        System.out.println("10. Increase the salary for top 2 most active drivers.");
        System.out.println("11. EXIT");
        System.out.println("     ? ? ? ? ?   How can I help you   ? ? ? ? ? ");
        System.out.println(" - Introduce the option number that you choose : ");
    }

    public void addClient() {
        UserConsumer client = readServices.readClient();
        appUser.add(client);
        sortUsersByFullName();
    }

    public void addClient(UserConsumer client) {
        appUser.add(client);
        sortUsersByFullName();
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
        driversAvailability.add(LocalDateTime.now());
    }

    public void sortUsersByFullName() {
        appUser.sort(new Comparator<UserConsumer>() {
            public int compare(UserConsumer o1, UserConsumer o2) {
                return Integer.compare(0, o1.getFirstName().compareTo(o2.getFirstName()));
            }
        });
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

    public void orderFood() throws InterruptedException {
        Scanner in = new Scanner(System.in);

        System.out.println("Which id have the user that ordered the food ? Enter the user id : ");
        Long userId = in.nextLong();

        System.out.println("Enter the order info :");
        Order order = readServices.readOrder();

        for (UserConsumer user : appUser) {
            if (user.getId().equals(userId)) {
                user.addOrder(order);
                break;
            }
        }

        //update stock
        Long restaurantId = order.getRestaurantId();

        for (Restaurant restaurant : appRestaurants) {
            if (restaurant.getId().equals(restaurantId)) {
                restaurant.updateStock(order.getProductsOrdered());
                break;
            }
        }

        Integer driverIndex;

        while ((driverIndex = getDriverIndex()) != -1) {
            wait(10); // we will wait until a driver is available
        }

        System.out.println("Comanda a fost preluata si va fi livrata in " + order.getProductsOrdered().size() + " minutes and the name of the driver is " + appDrivers.get(driverIndex).getFullName());
        driversAvailability.set(driverIndex, LocalDateTime.now().plusMinutes(order.getProductsOrdered().size()));
        // here I added num of products minutes to the now local date time
    }

    public void printUserThatOrderedToday() {
        for (UserConsumer user : appUser) {
            if (user.getLastOrder().getDateTime().toLocalDate().isEqual(LocalDate.now())) {
                System.out.println(user.toString());
            }
        }
    }

    public void printFirst3UsersWithMaxNumOrders() {
        Integer poz1 = 0, poz2 = 0, poz3 = 0, noOfOrders;
        for (Integer i = 0; i < appUser.size(); i++) {
            noOfOrders = appUser.get(i).getNumOfOrders();
            if (noOfOrders > appUser.get(poz1).getNumOfOrders()) {
                poz3 = poz2;
                poz2 = poz1;
                poz1 = i;
            } else {
                if (noOfOrders > appUser.get(poz2).getNumOfOrders()) {
                    poz3 = poz2;
                    poz2 = noOfOrders;
                } else {
                    if (noOfOrders > appUser.get(poz3).getNumOfOrders()) {
                        poz3 = noOfOrders;
                    }
                }
            }
        }
        System.out.println("The user with the maximum number of the orders is : " + appUser.get(poz1).toString());
        System.out.println("The user with the second maximum number of the orders is : " + appUser.get(poz2).toString());
        System.out.println("The user with the third maximum number of the orders is : " + appUser.get(poz3).toString());
    }

    private Integer getDriverIndex() {
        Integer position = 0;
        for (Integer i = 0; i < appDrivers.size(); i++) {
            if (driversAvailability.get(i).isAfter(LocalDateTime.now())) {
                return i;
            }
        }
        return -1; // we don't have disponible drivers and we have to wait
    }

    private Long getNoOfOrders(UserEmployee driver) {
        Long counter = 0L;
        for (UserConsumer user : appUser) {
            counter += user.getNoOfOrdersForADriver(driver);
        }
        return counter;
    }

    public void increaseSalaryForTop2MostActiveDrivers() {
        appDrivers.stream().sorted(Comparator.comparingLong(this::getNoOfOrders).reversed()).limit(2).toList().forEach((UserEmployee driver) -> driver.increaseSalaryByXPercent(10));
    }
}
