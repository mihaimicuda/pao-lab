package Components;

public abstract class Entity<T> {
    protected T id;

    public Entity(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
