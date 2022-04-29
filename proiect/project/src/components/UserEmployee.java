package Components;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserEmployee extends AbstractUser {
    enum possibleJobs{
        CEO,
        Manager,
        Secretary,
        DeputyManager,
        Drivers,
        CallCenterOperators
    };

    private long salaryPerMonth;
    private LocalDateTime dateOfHire;
    private possibleJobs jobName;


    public UserEmployee(String firstName, String lastName, String emailAddress, LocalDateTime timeOfBirth, Address addressOfLiving, long salaryPerMonth, possibleJobs job) {
        super(firstName, lastName, emailAddress, timeOfBirth, addressOfLiving);

        this.salaryPerMonth = salaryPerMonth;
        this.jobName = job;

        this.dateOfHire = LocalDateTime.now();
    }

    public long getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(long salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public LocalDateTime getDateOfHire() {
        return dateOfHire;
    }

    public void setTimeOfHire(LocalDateTime timeOfHire) {
        this.dateOfHire = timeOfHire;
    }


    @Override
    public String toString() {
        return "UserEmployee{" +
                AbstractUser.class.toString() +
                ", salaryPerMonth=" + salaryPerMonth +
                ", dateOfHire=" + dateOfHire.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                ", jobName='" + jobName.toString() + '\'' +
                '}';
    }
}
