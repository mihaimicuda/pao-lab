package ro.proiect.Interfaces;

public interface Icard {
    void Pay(int value);

    int GetAllowance();

    void Charge(int value);

    Icard Clone();
}
