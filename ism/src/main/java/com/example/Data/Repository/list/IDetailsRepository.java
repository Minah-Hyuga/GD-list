// package com.example.Data.Repository.list;

// import java.util.List;

// import com.example.Data.Entity.Details;

// public interface IDetailsRepository {
// List<Details> getAll();

// }
package com.example.Data.Repository.list;

import java.util.List;
import com.example.Data.Entity.Details;

public interface IDetailsRepository {
    void add(Details details);

    List<Details> getAll();

    Details getById(int id);

    boolean delete(int id);
}
