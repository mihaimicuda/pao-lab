package ro.unibuc.printers;

public interface ElectronicsDevice {

    default void printVoltage() {
        System.out.println("220");
    }

}
