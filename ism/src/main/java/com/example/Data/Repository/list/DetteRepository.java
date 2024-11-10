package com.example.Data.Repository.list;

import java.util.ArrayList;
import java.util.List;
import com.example.Data.Entity.Dette;

public class DetteRepository implements IDetteRepository {

    // Liste pour stocker les dettes
    private List<Dette> detteList;

    public DetteRepository() {
        // Initialisation de la liste des dettes
        this.detteList = new ArrayList<>();
    }

    // Méthode pour ajouter une dette
    public void add(Dette dette) {
        detteList.add(dette); // Ajoute l'objet dette à la liste
    }

    // Méthode pour récupérer toutes les dettes
    public List<Dette> getAll() {
        return new ArrayList<>(detteList); // Retourne une copie de la liste pour éviter les modifications externes
    }

    // Méthode pour récupérer une dette par son ID
    public Dette getByIdDette(int idDette) {
        for (Dette dette : detteList) {
            if (dette.getIdDette() == idDette) { // Remplacez getId() par la méthode appropriée pour récupérer l'ID
                return dette;
            }
        }
        return null; // Retourne null si aucune dette avec cet ID n'est trouvée
    }

    // Méthode pour supprimer une dette par ID
    public boolean delete(int id) {
        for (int i = 0; i < detteList.size(); i++) {
            if (detteList.get(i).getIdDette() == id) {
                detteList.remove(i); // Supprime l'élément à l'index i
                return true; // Retourne true si la suppression a réussi
            }
        }
        return false; // Retourne false si aucune dette n'a été trouvée avec cet ID
    }

    @Override
    public Dette getByIddDette(int idDette) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByIddDette'");
    }
}
