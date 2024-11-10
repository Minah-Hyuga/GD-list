package com.example.View;

import java.util.List;

import com.example.Data.Entity.User;

public interface IUserView {
    User saisir();

    void afficher(List<User> all);
}
