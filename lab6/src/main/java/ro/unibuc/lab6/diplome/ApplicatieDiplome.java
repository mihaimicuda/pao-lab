package ro.unibuc.lab6.diplome;

public class ApplicatieDiplome {
    public static void main(String[] args) {
        DiplomaService diplomaService = new DiplomaInMemoryService();

        Diploma diploma = new Diploma("1", "X", 4, "unibuc", "info", 9.5);

        diplomaService.save(diploma);

        System.out.println(diplomaService.getByAbsolvent("X"));
    }
}
