package ro.unibuc.printers;

public class CanonPrinter extends CanonProduct implements LaserPrinter {
    @Override
    public void print(String content) {
        System.out.println("[canon]" + content);
    }
}
