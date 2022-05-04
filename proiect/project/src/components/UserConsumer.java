package Components;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserConsumer extends AbstractUser {

    private final LocalDate dateOfSignUp;
    private List<Order> lastOrders;

    public UserConsumer(String firstName, String lastName, String emailAddress, LocalDate timeOfBirth, Address addressOfLiving) {
        super(firstName, lastName, emailAddress, timeOfBirth, addressOfLiving);
        dateOfSignUp = LocalDate.now();
        lastOrders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        lastOrders.add(order);
    }

    public Order getLastOrder() {
        return this.lastOrders.get(lastOrders.size() - 1);
    }

    public Integer getNumOfOrders() {
        return this.lastOrders.size();
    }

    public Long getNoOfOrdersForADriver(UserEmployee driver) {
        Long counter = 0L;
        for (Order order : lastOrders) {
            if (Objects.equals(driver.getId(), order.getDriverID())) {
                counter += 1;
            }
        }
        return counter;
    }

    public double returnSumLastOrder(List<Product> restaurantProducts) {
        if (lastOrders.size() >= 1)
            return lastOrders.get(lastOrders.size() - 1).calculateTotalFee(restaurantProducts);
        return 0.0;
    }

    public LocalDateTime returnTimeOfLastOrder() {
        if (lastOrders.size() >= 1)
            return lastOrders.get(lastOrders.size() - 1).getDateTime();
        return LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "UserConsumer {" +
                super.toString() +
                ", dateOfSignUp=" + dateOfSignUp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                '}';
    }
}
