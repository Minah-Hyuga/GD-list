package com.example.View;

import java.util.List;

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
    public Object getObject(List list) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getObject'");
    }
}