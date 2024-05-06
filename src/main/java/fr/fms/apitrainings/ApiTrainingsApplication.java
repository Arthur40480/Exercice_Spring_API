package fr.fms.apitrainings;

import fr.fms.apitrainings.dao.TrainingRepository;
import fr.fms.apitrainings.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTrainingsApplication implements CommandLineRunner {

	@Autowired
	private TrainingRepository trainingRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTrainingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws  Exception {
		Training training = new Training(null, "Java", "Formation Java", 150, 1);
		trainingRepository.save(training);
		trainingRepository.save(new Training(null, "Java", "Formation Java", 150, 1));
		trainingRepository.save(new Training(null, "C", "Formation C", 100, 1));
		trainingRepository.save(new Training(null, "Javascript", "Formation Javascript", 120, 1));
		trainingRepository.save(new Training(null, "Python", "Formation Python", 300, 1));
		trainingRepository.save(new Training(null, "NodeJS", "Formation NodeJS", 175, 1));
	}

}
