package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Paiement;
import com.example.Data.Repository.list.IPaiementRepository;
import com.example.Data.Repository.list.PaiementRepository;

public class PaiementService implements IPaiementService {
    // private final IPaiementRepository paiementRepository;

    public PaiementService(IPaiementRepository paiementRepository) {
        // this.paiementRepository = paiementRepository;
    }

    @Override
    public void create(Paiement paiement) {
        PaiementRepository.add(paiement);
    }

    @Override
    public List<Paiement> getAll() {
        return PaiementRepository.getAll();
    }
}
