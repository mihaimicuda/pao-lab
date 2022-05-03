package Components;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class AbstractUser extends Entity<Long> {

    static long serialOfUserNumber = 0;

    protected String firstName, lastName, emailAddress;
    protected LocalDate dateOfBirth;
    protected Address addressOfLiving;

    public AbstractUser(String firstName, String lastName, String emailAddress, LocalDate timestampOfBirth, Address addressOfLiving) {
        super(serialOfUserNumber);
        serialOfUserNumber += 1;

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.dateOfBirth = timestampOfBirth;
        this.addressOfLiving = addressOfLiving;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() { return firstName + " " + lastName; }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
                ", id=" + getId();
    }
}
