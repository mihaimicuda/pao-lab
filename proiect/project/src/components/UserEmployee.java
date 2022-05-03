package Components;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserEmployee extends AbstractUser {

    private long salaryPerMonth;
    private LocalDate dateOfHire;
    private final PossibleJobs jobName;
//    private double x, y; // coordinates of his position on the map

    public UserEmployee(String firstName, String lastName, String emailAddress, LocalDate timeOfBirth, Address addressOfLiving, long salaryPerMonth, PossibleJobs job) {
        super(firstName, lastName, emailAddress, timeOfBirth, addressOfLiving);

        this.salaryPerMonth = salaryPerMonth;
        this.jobName = job;
        this.dateOfHire = LocalDate.now();
    }

    public long getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(long salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }


    @Override
    public String toString() {
        return "UserEmployee{" +
                super.toString() +
                ", salaryPerMonth=" + salaryPerMonth +
                ", dateOfHire=" + dateOfHire.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) +
                ", jobName='" + jobName.toString() + '\'' +
                '}';
    }
}
