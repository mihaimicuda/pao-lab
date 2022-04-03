public class AngajatPartTime extends Angajat {

    int salariu;

//    public AngajatPartTime() {
//        super();
//    }

    public AngajatPartTime(int id, String nume) {
        super(id, nume);
    }

    public AngajatPartTime(int id, String nume, int salariu) {
        //this(id, nume);
//        super(id, nume);
        super();
        this.salariu = salariu;
    }

    @Override
    public int getSalariu() {
//        return super.getSalariu();
        return salariu;
    }

    public String getJobDesc(){
        return "STUFF";
    }

    @Override
    public String toString() {
        return "AngajatPartTime{" +
                "salariu=" + salariu +
                ", id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
