package com.example.Services;

import java.util.List;
import com.example.Data.Entity.Client;

public interface IClientService {
    void create(Client client);

    List<Client> getAll();
}
