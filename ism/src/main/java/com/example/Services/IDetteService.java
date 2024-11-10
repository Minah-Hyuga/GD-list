package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Dette;

public interface IDetteService {

    void create(Dette dette);

    List<Dette> getAll();
}
