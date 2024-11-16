package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Dette;
import com.example.Data.Repository.list.IDetteRepository;

public class DetteService implements IDetteService {
    private final IDetteRepository detteRepository;

    public DetteService(IDetteRepository detteRepository) {
        this.detteRepository = detteRepository;
    }

    @Override
    public List<Dette> getAll() {
        return detteRepository.getAll();
    }

    @Override
    public void create(Dette dette) {
        detteRepository.add(dette);
    }
}
