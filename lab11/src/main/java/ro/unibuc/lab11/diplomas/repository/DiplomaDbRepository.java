package ro.unibuc.lab11.diplomas.repository;

import ro.unibuc.lab11.diplomas.config.DbConnection;
import ro.unibuc.lab11.diplomas.model.Diploma;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/*
    Aici vom defini toate query urile pentru entitatea Diploma
 */

public class DiplomaDbRepository implements DiplomaRepository{

    private Connection connection;

    @Override
    public void save(Diploma diploma) throws SQLException {
        this.connection = DbConnection.getInstance();
    }

    @Override
    public List<Diploma> getAll() {
        return Collections.emptyList();
    }
}
