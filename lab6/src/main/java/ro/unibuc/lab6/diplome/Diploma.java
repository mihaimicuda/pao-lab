package ro.unibuc.lab6.diplome;

public class Diploma {

    private String serie;
    private String absolvent;
    private int an;
    private String facultate;
    private String specializare;
    private double medie;

    public Diploma(String serie, String absolvent, int an, String facultate, String specializare, double medie) {
        this.serie = serie;
        this.absolvent = absolvent;
        this.an = an;
        this.facultate = facultate;
        this.specializare = specializare;
        this.medie = medie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAbsolvent() {
        return absolvent;
    }

    public void setAbsolvent(String absolvent) {
        this.absolvent = absolvent;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Diploma{" +
                "serie='" + serie + '\'' +
                ", absolvent='" + absolvent + '\'' +
                ", an=" + an +
                ", facultate='" + facultate + '\'' +
                ", specializare='" + specializare + '\'' +
                ", medie=" + medie +
                '}';
    }
}
