package fr.fms.apitrainings.web;

import fr.fms.apitrainings.business.IBusiness;
import fr.fms.apitrainings.business.IBusinessImpl;
import fr.fms.apitrainings.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TrainingController {

    @Autowired
    private IBusinessImpl iBusiness;

    @GetMapping("/trainings")
    public List<Training> allTrainings() {
        return iBusiness.getTrainings();
    }

    @PostMapping("/trainings")
    public ResponseEntity<Training> saveTraining(@RequestBody Training training) {
        Training training1 = iBusiness.saveTraining(training);
        if(Objects.isNull(training1)) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(training.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("trainings/{id}")
    public void deleteTraining(@PathVariable("id") Long id) {
        iBusiness.deleteTraining(id);
    }

    @GetMapping("/training/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id") Long id) {
        Optional<Training> training = iBusiness.getTrainingById(id);
        if(training.isPresent()) {
            return new ResponseEntity<>(training.get(), HttpStatus.OK);
        }
        return null;
    }

}