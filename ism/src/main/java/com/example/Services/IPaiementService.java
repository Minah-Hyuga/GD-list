package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Paiement;

public interface IPaiementService {
    void create(Paiement paiement);

    List<Paiement> getAll();
}
