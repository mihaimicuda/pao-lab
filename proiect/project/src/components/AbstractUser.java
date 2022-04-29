package Components;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractUser {

    static long serialOfUserNumber = 0;

    protected String firstName, lastName, emailAddress;
    protected LocalDateTime dateOfBirth;
    protected Address addressOfLiving;

    protected long id;

    public AbstractUser(String firstName, String lastName, String emailAddress, LocalDateTime timestampOfBirth, Address addressOfLiving) {

        serialOfUserNumber += 1;
        this.id = serialOfUserNumber;

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dateOfBirth = timestampOfBirth;
        this.addressOfLiving = addressOfLiving;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddressOfLiving() {
        return addressOfLiving;
    }

    public void setAddressOfLiving(Address addressOfLiving) {
        this.addressOfLiving = addressOfLiving;
    }

    public static long getSerialOfUserNumber() {
        return serialOfUserNumber;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                ", addressOfLiving=" + addressOfLiving +
                ", id=" + id;
    }
}
