public class SecondApplication {
    /*
    receive 2 arguments
    if first argument is true say hello to second
     */
    public static void main(String[] args) {
        String firstArg = args[0];
        String secondArg = args[1];

        boolean canPass = Boolean.parseBoolean(firstArg);

        if(canPass) {
            System.out.println("Hello " + secondArg);
        } else {
            System.out.println("You shall not pass!");
        }

        /*ternary operator
        expression ? instr1 : instr2
        */
        String message = canPass ? "Hello " + secondArg : "You shall not pass!";
        System.out.println(message);
    }
}
