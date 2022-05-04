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
                case 1 :
                    services.addClient();
                    break;
                case 2:
                    services.addDriver();
                    break;
                case 3:
                    services.addRestaurant();
                    break;
                case 4 :
                    services.viewClients();
                    break;
                case 5:
                    services.viewDrivers();
                    break;
                case 6:
                    services.viewRestaurants();
                    break;
                case 7 :
                    services.orderFood();
                    break;
                case 8:
                    services.printUserThatOrderedToday();
                    break;
                case 9:
                    services.printFirst3UsersWithMaxNumOrders();
                    break;
                case 10:
                    services.increaseSalaryForTop2MostActiveDrivers();
                    break;
                case 11:
                    break;
                default :
                    exit = true;
                    break;
            }
        }
    }
}
