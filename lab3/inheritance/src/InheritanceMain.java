public class InheritanceMain {
    public static void main(String[] args) {
//        Angajat angajat = new Angajat(1, "Geo");
//        System.out.println(angajat);

        AngajatPartTime angajatPartTime = new AngajatPartTime(2, "Ion", 100);
        System.out.println(angajatPartTime);

        System.out.println(angajatPartTime.getSalariu());
        System.out.println(angajatPartTime.getJobDesc());
    }
}
