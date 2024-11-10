package com.example.Data.Repository.list;

import java.util.ArrayList;
import java.util.List;
import com.example.Data.Entity.Details;

public class DetailsRepository implements IDetailsRepository {

    private List<Details> detailsList;

    public DetailsRepository() {
        this.detailsList = new ArrayList<>();
    }

    public void add(Details details) {
        detailsList.add(details);
    }

    public List<Details> getAll() {
        return new ArrayList<>(detailsList);
    }

    public Details getById(int id) {
        for (Details detail : detailsList) {
            if (detail.getId() == id) {
                return detail;
            }
        }
        return null;
    }

    public boolean delete(int id) {
        for (int i = 0; i < detailsList.size(); i++) {
            if (detailsList.get(i).getId() == id) {
                detailsList.remove(i); // Supprime l'élément à l'index i
                return true;
            }
        }
        return false;
    }
}
