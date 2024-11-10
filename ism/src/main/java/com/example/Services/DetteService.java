package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Dette;
import com.example.Data.Repository.list.DetteRepository;
import com.example.Data.Repository.list.IDetteRepository;

public class DetteService implements IDetteService {
    private final IDetteRepository detteRepository;

    public DetteService(IDetteRepository detteRepository) {
        this.detteRepository = detteRepository;
    }

    @Override
    public void create(Dette dette) {
        DetteRepository.add(dette);
        System.out.println("Dette ajouter avec succès");
    }

    @Override
    public List<Dette> getAll() {
        return detteRepository.getAll();
    }
}
