package repository;


public interface RepositoryInterface<T>{

    public void add(T entity);

    public T get(int id);

    public void update(int index, T entity);

    public void delete(int index);

    public int getSize();

}
