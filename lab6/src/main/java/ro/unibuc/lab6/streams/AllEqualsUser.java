package ro.unibuc.lab6.streams;

public class AllEqualsUser extends User {
    public AllEqualsUser(String name, int id) {
        super(name, id);
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
