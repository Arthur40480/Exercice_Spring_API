package fr.fms.apitrainings.business;

import fr.fms.apitrainings.dao.TrainingRepository;
import fr.fms.apitrainings.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IBusinessImpl implements IBusiness {

    @Autowired
    TrainingRepository trainingRepository;

    @Override
    public List<Training> getTrainings() {return trainingRepository.findAll(); }

    @Override
    public Optional<Training> getTrainingById(Long idTraining) { return trainingRepository.findById(idTraining); }

    @Override
    public Training saveTraining(Training training) { return trainingRepository.save(training); }

    @Override
    public void deleteTraining(Long idTraining) { trainingRepository.deleteById(idTraining); }

}
