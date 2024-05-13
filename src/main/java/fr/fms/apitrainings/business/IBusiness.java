package fr.fms.apitrainings.business;

import fr.fms.apitrainings.entities.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBusiness {

    //TRAININGS
    List<Training> getTrainings();
    List<Training> getTrainingsByCategory(Long idCategory);
    Optional<Training> getTrainingById(Long idTraining);
    Training saveTraining(Training training);
    void deleteTraining(Long idTraining);

    //CATEGORIES
    List<Category> getCategories();

    //USERS
    List<User> getUsers();

    //USER_ROLE
    List<UserRole> getAllUserRole(Long idUser);

    //CUSTOMER
    Customer saveCustomer(Customer customer);

    //ORDER
    Commande saveOrder(Commande order);
}
