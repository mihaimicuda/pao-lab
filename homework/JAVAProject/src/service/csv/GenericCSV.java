package service.csv;

import java.io.IOException;
import java.util.List;

public interface GenericCSV<T>{
    void write(T t) throws IOException;
    List<T> read() throws IOException;
}
