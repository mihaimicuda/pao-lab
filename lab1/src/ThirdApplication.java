public class ThirdApplication {
    public static void main(String[] args) {
        String arg1 = args[0]; //number
        String message = args[1];

        int numberOfRepetitions = Integer.parseInt(arg1);

        for (int i = 0; i < numberOfRepetitions; i++) {
            System.out.println(message);
        }

        //i--   same as  i = i -1
        //i++ same as i = i + 1

        for (int i = numberOfRepetitions; i > 0; i--) {
            System.out.println(message);
        }

        // careful on below scenario
//        String bucket = "";
//        for (int i = numberOfRepetitions; i > 0; i++) {
//            bucket += message;
//            System.out.println(message);
//        }

//        String bucket = "";
//        for (int i = numberOfRepetitions; i > 0; i++) {
//            bucket += message;
//            System.out.println(message);
//        }

        System.out.println("--------------------------------------");
        /*
        while verifica intai conditia
         */
        int counter = numberOfRepetitions;
        while(counter > 0) {
            System.out.println(message);
            counter--;
        }

        System.out.println("");

        /*
        do while executa intai codul si apoi verifica
         */
        do {
            System.out.print(message);
            counter--;
        } while (counter > 0);
    }
}
