package ro.unibuc.printers;

public class HPPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("[I'm an HP printer]" + content);
    }

    @Override
    public void printIntro() {
        System.out.println("HP Intro");
    }
}
