package com.example.Data.Repository.list;

import java.util.ArrayList;
import java.util.List;

import com.example.Data.Entity.Client;

public class ClientRepository implements IClientRepository {

    private List<Client> clients;

    public ClientRepository() {
        this.clients = new ArrayList<>();
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients);
    }

    @Override
    public Client selectBySurname(String value) {
        for (Client client : clients) {
            if (client.getSurname().equalsIgnoreCase(value)) {
                return client;
            }
        }
        return null;
    }

    public void add(Client client) {
        clients.add(client);
    }

    public void remove(Client client) {
        clients.remove(client);
    }
}
