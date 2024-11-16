package com.example;

import java.util.Scanner;

import com.example.Data.Repository.list.ArticleRepository;
import com.example.Data.Repository.list.ClientRepository;
import com.example.Data.Repository.list.DetailsRepository;
import com.example.Data.Repository.list.DetteRepository;
import com.example.Data.Repository.list.IArticleRepository;
import com.example.Data.Repository.list.IClientRepository;
import com.example.Data.Repository.list.IDetailsRepository;
import com.example.Data.Repository.list.IDetteRepository;
import com.example.Data.Repository.list.IUserRepository;
import com.example.Data.Repository.list.UserRepository;
import com.example.Services.ArticleService;
import com.example.Services.ClientService;
import com.example.Services.DetailsService;
import com.example.Services.DetteService;
import com.example.Services.IArticleService;
import com.example.Services.IClientService;
import com.example.Services.IDetailService;
import com.example.Services.IDetteService;
import com.example.Services.IUserService;
import com.example.Services.UserService;
import com.example.View.ArticleView;
import com.example.View.ClientView;
import com.example.View.DetailsView;
import com.example.View.DetteView;
import com.example.View.IArticleView;
import com.example.View.IClientView;
import com.example.View.IDetailsView;
import com.example.View.IDetteView;
import com.example.View.IUserView;
import com.example.View.ImplView;
import com.example.View.UserView;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Configurer le scanner pour les vues
        ImplView.setScanner(scanner);

        int choice;
        // Initialisation des services et les vues
        IClientRepository clientRepository = new ClientRepository();
        IClientService clientService = new ClientService(clientRepository);
        IClientView clientView = new ClientView();

        IUserRepository userRepository = new UserRepository();
        IUserService userService = new UserService(userRepository);
        IUserView userView = new UserView();

        IArticleRepository articleRepository = new ArticleRepository();
        IArticleService articleService = new ArticleService(articleRepository);
        IArticleView articleView = new ArticleView();

        IDetailsRepository detailsRepository = new DetailsRepository();
        IDetailService detailService = new DetailsService(detailsRepository);
        IDetailsView detailsView = new DetailsView();

        IDetteRepository detteRepository = new DetteRepository();
        IDetteService detteService = new DetteService(detteRepository);
        IDetteView detteView = new DetteView();

        // Boucle principale pour le menu
        do {
            choice = menu();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    clientService.create(clientView.saisir());
                    System.out.println("Client ajouter avec succés");
                    break;
                case 2:
                    clientView.afficher(clientService.getAll());
                    break;
                case 3:
                    userService.create(userView.saisir());
                    System.out.println("Utilisateur ajouter avec succés");
                    break;
                case 4:
                    userView.afficher(userService.getAll());
                    break;
                case 5:
                    detailService.create(detailsView.saisir());
                    System.out.println("Details ajouter avec succés");
                    break;
                case 6:
                    detailsView.afficher(detailService.getAll());
                    break;
                case 7:
                    articleService.create(articleView.saisir());
                    System.out.println("Article ajouter avec succés");
                    break;
                case 8:
                    articleView.afficher(articleService.getAll());
                    break;
                case 9:
                    detteService.create(detteView.saisir());
                    System.out.println("Dette ajouter avec succés");
                    break;
                case 10:
                    detteView.afficher(detteService.getAll());
                    break;
                case 11:
                    // clientRepository.delete(detteView.remove());
                    System.out.println("Suppression d'un client ");
                    break;
                case 12:
                    System.out.println("Suppression d'un utilisateur ");
                    break;
                case 13:
                    System.out.println("Suppression d'un article ");
                    break;
                case 14:
                    System.out.println("Suppression d'une dette ");
                    break;
                case 15:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix non valide. Veuillez réessayer.");
                    break;
            }
        } while (choice != 15);
    }

    public static int menu() {
        System.out.println("Menu:");
        System.out.println("1- Ajouter un client");
        System.out.println("2- Lister les clients");
        System.out.println("3- Ajouter un utilisateur");
        System.out.println("4- Lister les utilisateurs");
        System.out.println("5- Ajouter un article");
        System.out.println("6- Lister les articles");
        System.out.println("7- Ajouter une dette");
        System.out.println("8- Lister les dettes");
        System.out.println("9- Supprimer un article");
        System.out.println("10- Supprimer une dette");
        System.out.println("11- Supprimer un client");
        System.out.println("12- Supprimer un utilisateur");
        System.out.println("13- Quitter");
        System.out.print("Faites votre choix : ");
        return scanner.nextInt();
    }
}
