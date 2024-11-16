package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Details;
import com.example.Data.Repository.list.IDetailsRepository;

public class DetailsService implements IDetailService {
    private final IDetailsRepository detailsRepository;

    public DetailsService(IDetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    // @Override
    // public void update(Details details) {
    // detailsRepository.update(details);
    // }

    @Override
    public void create(Details details) {
        detailsRepository.add(details);
        System.out.println("Details ajouter avec succès");
    }

    @Override
    public List<Details> getAll() {
        return detailsRepository.getAll();
    }

    public void deleteDetails() {
        System.out.println("Details supprimés avec succès");
    }
}
