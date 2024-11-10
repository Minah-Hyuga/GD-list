package com.example.Data.Repository.list;

import java.util.ArrayList;
import java.util.List;

import com.example.Data.Entity.Client;

public class ClientRepository implements IClientRepository {

    private List<Client> clients;

    public ClientRepository() {
        // Initialisation de la liste des clients
        this.clients = new ArrayList<>();
        // Ajouter des clients par défaut si nécessaire
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients); // Retourne une copie de la liste pour éviter la modification externe
    }

    @Override
    public Client selectBySurname(String value) {
        for (Client client : clients) {
            if (client.getSurname().equalsIgnoreCase(value)) {
                return client;
            }
        }
        return null; // Retourne null si aucun client avec ce nom n'est trouvé
    }

    // Méthode pour ajouter un client (optionnelle)
    public void addClient(Client client) {
        clients.add(client);
    }
}
