package ro.unibuc.laborator;

import ro.unibuc.laborator.lab2.TransferService;

public class SingletonApp {
    public static void main(String[] args) {
        //        TransferService transferService = new TransferService();
        TransferService transferService = TransferService.getInstance();
        TransferService transferService1 = TransferService.getInstance();
        TransferService transferService2 = TransferService.getInstance();

        System.out.println(transferService);
        System.out.println(transferService1);
        System.out.println(transferService2);

        System.out.println(transferService == transferService1);
        System.out.println(transferService == transferService2);
    }
}
