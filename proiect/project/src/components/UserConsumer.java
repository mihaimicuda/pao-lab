package Components;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserConsumer extends AbstractUser {

    private final LocalDate dateOfSignUp;
    private List<Order> lastOrders;

    public UserConsumer(String firstName, String lastName, String emailAddress, LocalDate timeOfBirth, Address addressOfLiving) {
        super(firstName, lastName, emailAddress, timeOfBirth, addressOfLiving);
        dateOfSignUp = LocalDate.now();
        lastOrders = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "UserConsumer {" +
                super.toString() +
                ", dateOfSignUp=" + dateOfSignUp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                '}';
    }
}
