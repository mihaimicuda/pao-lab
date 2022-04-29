package Components;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UserEmployee extends AbstractUser {
    private long salaryPerMonth;
    private long timestampOfHire;
    private String jobName; // manager, deliveryGuy, secretary, etc

    public UserEmployee(String firstName, String lastName, String emailAddress, long timestampOfBirth, Address addressOfLiving, long salaryPerMonth, long timestampOfHire, String jobName) {
        super(firstName, lastName, emailAddress, timestampOfBirth, addressOfLiving);
        this.salaryPerMonth = salaryPerMonth;
        this.timestampOfHire = timestampOfHire;
        this.jobName = jobName;
    }

    public long getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(long salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public long getTimestampOfHire() {
        return timestampOfHire;
    }

    public void setTimestampOfHire(long timestampOfHire) {
        this.timestampOfHire = timestampOfHire;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    public String getDateOfHireString() {

        Date date = new Date(this.timestampOfHire);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));

        return format.format(date);
    }
}
