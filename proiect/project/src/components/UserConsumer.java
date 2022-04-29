package Components;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserConsumer extends AbstractUser {

    private final LocalDateTime dateOfSignUp;
    private List<Order> lastOrders;

    public UserConsumer(String firstName, String lastName, String emailAddress, LocalDateTime timeOfBirth, Address addressOfLiving) {
        super(firstName, lastName, emailAddress, timeOfBirth, addressOfLiving);
        dateOfSignUp = LocalDateTime.now();
    }

    public LocalDateTime getDateOfSignUp() {
        return dateOfSignUp;
    }

    @Override
    public String toString() {
        return "UserConsumer {" +
                AbstractUser.class.toString() +
                ", dateOfSignUp=" + dateOfSignUp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                '}';
    }
}
