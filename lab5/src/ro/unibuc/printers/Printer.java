package ro.unibuc.printers;

@FunctionalInterface
public interface Printer {

    public static final String serialNumber = "1243124124124"; //public static final implicit

//    public abstract void print(String content) {} -> cannot have a body

    void print(String content);

//    void doSomething(); //-> not allowed to have 2 abstract methods in a functional interface

    default void printIntro() {
        System.out.println("Generic intro");
    }

    static void printScope() {
        System.out.println("All floors");
    }
}
