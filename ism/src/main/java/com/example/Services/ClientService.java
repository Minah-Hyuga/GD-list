package com.example.Services;

import java.util.List;

import com.example.Data.Entity.Client;
import com.example.Data.Repository.list.IClientRepository;

public class ClientService implements IClientService {
    private final IClientRepository clientRepository;

    public ClientService(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        clientRepository.add(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }
}
