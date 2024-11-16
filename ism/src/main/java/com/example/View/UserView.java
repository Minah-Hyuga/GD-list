package com.example.View;

import java.util.List;

import com.example.Data.Entity.User;

public class UserView extends ImplView<User> implements IUserView {
    @Override
    public User saisir() {
        User user = new User();
        System.out.println("Saisir le nom : ");
        user.setLogin(scanner.nextLine());
        System.out.println("Saisir le prenom : ");
        user.setPassword(scanner.nextLine());
        System.out.println("Saisir le telephone : ");
        user.setEmail(scanner.nextLine());
        return user;

    }

    @Override
    public void afficher(List<User> users) {
        if (users.isEmpty()) {
            System.out.println("Aucun utilisateur enregistré.");
        } else {
            System.out.println("Liste des utilisateurs enregistrés :");
            for (User user : users) {
                System.out.println("Login : " + user.getLogin());
                System.out.println("Mot de passe : " + user.getPassword());
                System.out.println("Email : " + user.getEmail());
                System.out.println(
                        "Client associé : " + (user.getClient() != null ? user.getClient().getSurname() : "Aucun"));
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public User getObject(List<User> list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }

}