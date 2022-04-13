package ro.unibuc.printers;

public class Main {
    public static void main(String[] args) {
        Printer.printScope(); //printScope is static

        HPPrinter printer = new HPPrinter();
        printer.print("stuff");
        printer.printIntro();

        //Printer.serialNumber = "blabla"; -> not allowed

        Printer printer1 = new Printer() {
            @Override
            public void print(String content) {
                System.out.println("[I'm an anonymous printer]" + content);
            }
        };
        printer1.print("more anonymous stuff");

        LaserPrinter laserPrinter = new LaserPrinter() {
            @Override
            public void print(String content) {
                System.out.println("[laser printer]" + content);
            }
        };
        laserPrinter.print("laser stuff");
        laserPrinter.printIntro();
        laserPrinter.printVoltage();

        //--------------------------------------------------------

        //polimorfism: abilitatea unui obiect de a fi referentiat in mai multe moduri
        //metodele la care avem acces sunt cele din referinta, indiferent de tipul obiectului creat cu new
        //1. prin referinta de tipul clasei obiectului
        CanonPrinter cp1 = new CanonPrinter();
        cp1.print("canon stuff");
        cp1.printIntro();
        cp1.printVoltage();
        cp1.printLogo();

        //2. prin referinta de tipul clasei de baza(CanonPrinter extinde CanonProduct)
        CanonProduct cp2 = new CanonPrinter();
        cp2.printLogo();
        //        cp2.printIntro(); -> not alowed, not available on reference type
        //        cp2.printVoltage();
        ((CanonPrinter)cp2).printVoltage(); // cast-> modific tipul referintei
        ((CanonPrinter)cp2).printIntro();

        LaserPrinter laserPrinterCanon = (LaserPrinter) cp2;

        CanonProduct canonProduct = new CanonProduct();
//        CanonPrinter canonPrinter = (CanonPrinter) canonProduct; //arunca ClassCastException, nu stie sa implementeze
        //metodele din CanonPrinter care nu sunt si in CanonProduct

//        canonPrinter.printVoltage();
//        canonPrinter.print("canon product printing");

        //3. prin referinta catre o interfata implementata de clasa
        LaserPrinter cp3 = new CanonPrinter();
        cp3.printVoltage();
        cp3.printIntro();
        cp3.print("stuff");
    }
}
