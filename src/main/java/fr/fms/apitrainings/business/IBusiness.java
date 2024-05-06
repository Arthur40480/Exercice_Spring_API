package fr.fms.apitrainings.business;

import fr.fms.apitrainings.entities.Training;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IBusiness {

    List<Training> getTrainings();
    Optional<Training> getTrainingById(Long idTraining);
    Training saveTraining(Training training);
    void deleteTraining(Long idTraining);
}
