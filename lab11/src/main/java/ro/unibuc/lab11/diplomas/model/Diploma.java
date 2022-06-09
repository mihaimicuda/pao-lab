package ro.unibuc.lab11.diplomas.model;

import java.io.Serializable;
import java.util.Objects;

public class Diploma implements Serializable {

    private String series;
    private String graduate;
    private int year;
    private String faculty;
    private Specialization specialization;
    private double grade;

    public Diploma(String series, String graduate, int year, String faculty, Specialization specialization, double grade) {
        this.series = series;
        this.graduate = graduate;
        this.year = year;
        this.faculty = faculty;
        this.specialization = specialization;
        this.grade = grade;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Diploma{" +
                "series='" + series + '\'' +
                ", graduate='" + graduate + '\'' +
                ", year=" + year +
                ", faculty='" + faculty + '\'' +
                ", specialization='" + specialization + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diploma diploma = (Diploma) o;
        return year == diploma.year &&
                Double.compare(diploma.grade, grade) == 0 &&
                Objects.equals(series, diploma.series) &&
                Objects.equals(graduate, diploma.graduate) &&
                Objects.equals(faculty, diploma.faculty) &&
                Objects.equals(specialization, diploma.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, graduate, year, faculty, specialization, grade);
    }
}
