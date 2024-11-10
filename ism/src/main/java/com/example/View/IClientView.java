package com.example.View;

import java.util.List;

import com.example.Data.Entity.Client;

public interface IClientView {
    Client saisir();

    void afficher(List<Client> all);

}
