package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Details;

public interface IDetailService {
    void create(Details details);

    List<Details> getAll();
}
