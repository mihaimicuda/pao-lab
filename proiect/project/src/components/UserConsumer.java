package Components;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserConsumer extends AbstractUser {

    private final LocalDateTime dateOfSignUp;

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
