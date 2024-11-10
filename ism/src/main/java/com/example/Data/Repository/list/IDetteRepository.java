package com.example.Data.Repository.list;

import java.util.List;
import com.example.Data.Entity.Dette;

public interface IDetteRepository {
    void add(Dette dette);

    List<Dette> getAll();

    Dette getByIddDette(int idDette);

    boolean delete(int idDette);
}
