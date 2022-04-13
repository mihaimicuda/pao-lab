package ro.unibuc.lab7.diplome;

public class ApplicatieDiplome {
    public static void main(String[] args) {
        DiplomaService diplomaService = new DiplomaCsvService();

        Diploma diploma1 = new Diploma("1", "X", 2020, "unibuc", "info", 9.5);
        Diploma diploma2 = new Diploma("2", "Y", 2021, "unibuc", "info", 10);
        Diploma diploma3 = new Diploma("3", "Z", 1990, "unibuc", "info", 10);

        diplomaService.save(diploma1);
        diplomaService.save(diploma2);
        diplomaService.save(diploma3);

//        System.out.println(diplomaService.getByAbsolvent("X"));
//        System.out.println(diplomaService.getByAbsolvent("Z"));
//
//        System.out.println(diplomaService.getAll());

        System.out.println(diplomaService.findDiplomasBetweenYears(2000, 2022));

        System.out.println(diplomaService.findAllByPerfectScore());
    }
}
