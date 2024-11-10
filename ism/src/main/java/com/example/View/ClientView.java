package com.example.View;

import java.util.List;

import com.example.Data.Entity.Client;

public class ClientView extends ImplView<Client> implements IClientView {

    @Override
    public Client saisir() {
        Client Client = new Client();
        System.out.print("Entrez le surname du client : ");
        Client.setSurname(scanner.nextLine());
        System.out.print("Entrez le telepone du client : ");
        Client.setTel(scanner.nextLine());
        System.out.print("Entrez l'addresse du client : ");
        Client.setAddresse(scanner.nextLine());
        return Client;
    }

    @Override
    public void afficher(List<Client> all) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficher'");
    }

    @Override
    public Client getObject(List<Client> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }

}