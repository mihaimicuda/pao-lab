import java.io.Serializable;

public class Diploma implements Serializable {
    String student;

    public Diploma(String student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Diploma{" +
                "student='" + student + '\'' +
                '}';
    }
}
