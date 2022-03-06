package ro.unibuc.laborator.lab2;

public class TransferService {

    private int id = 1;

    private static TransferService transferService = new TransferService();

    public static TransferService getInstance() {
        return transferService;
    }

    private TransferService() {

    }

    public int getId() {
        return id;
    }
}
