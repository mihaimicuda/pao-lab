package Components;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class AbstractUser {
    protected String firstName, lastName, emailAddress;
    protected long timestampOfBirth;
    protected Address addressOfLiving;

    public AbstractUser(String firstName, String lastName, String emailAddress, long timestampOfBirth, Address addressOfLiving) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.timestampOfBirth = timestampOfBirth;
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

    public long getTimestampOfBirth() {
        return timestampOfBirth;
    }

    public void setTimestampOfBirth(long timestampOfBirth) {
        this.timestampOfBirth = timestampOfBirth;
    }

    public Address getAddressOfLiving() {
        return addressOfLiving;
    }

    public void setAddressOfLiving(Address addressOfLiving) {
        this.addressOfLiving = addressOfLiving;
    }

    public String getDateOfBirthString() {

        Date date = new Date(this.timestampOfBirth);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

        return format.format(date);
    }
}
