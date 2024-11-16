package com.example.Data.Repository.list;

import java.util.List;

import com.example.Data.Entity.Client;

public interface IClientRepository {

    List<Client> getAll();

    Client selectBySurname(String value);

    void add(Client client);

}
