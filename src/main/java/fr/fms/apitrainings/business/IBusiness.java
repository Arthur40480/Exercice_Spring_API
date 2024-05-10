package fr.fms.apitrainings.business;

import fr.fms.apitrainings.entities.Category;
import fr.fms.apitrainings.entities.Training;
import fr.fms.apitrainings.entities.User;
import fr.fms.apitrainings.entities.UserRole;
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
}
