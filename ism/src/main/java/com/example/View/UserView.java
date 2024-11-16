package com.example.View;

import java.util.List;

import com.example.Data.Entity.Article;
import com.example.Data.Entity.User;

public class UserView extends ImplView implements IUserView {
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
    public void afficher(List<User> user) {
        if (user.isEmpty()) {
            System.out.println("Aucun utilisateur enregistré.");
        } else {
            System.out.println("Liste des articles ajoutés :");
            for (Article user : user) {
                System.out.println("---------------------------");
                System.out.println("Réference : " + user.getRef());
                System.out.println("Libellé : " + user.getLibelle());
                System.out.println("Prix : " + user.getPrix());
                System.out.println("Quantité de l'article : " + user.getQuantiteArticle());
                System.out.println("---------------------------");
            }
        }
    }

    @Override
    public Object getObject(List list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }
}