package App;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Services services = Services.getInstance();

        Scanner in = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit) {

            services.showMenu();

            option = in.nextInt();

            switch (option) {
                case 1 -> services.addClient();
                case 2 -> services.addDriver();
                case 3 -> services.addProduct();
                case 4 -> services.addRestaurant();
                case 5 -> services.viewClients();
                case 6 -> services.viewDrivers();
                case 7 -> services.viewProducts();
                case 8 -> services.viewRestaurants();
                case 9 -> services.orderFood();
                case 10 -> services.printUserThatOrderedToday();
                case 11 -> services.printFirst3UsersWithMaxNumOrders();
                case 12 -> services.increaseSalaryForTop2MostActiveDrivers();
                default -> exit = true;
            }
        }
    }
}
