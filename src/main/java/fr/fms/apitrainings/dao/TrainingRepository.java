package fr.fms.apitrainings.dao;

import fr.fms.apitrainings.entities.Category;
import fr.fms.apitrainings.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long> {
    public List<Training> findByCategory(Category category);
}
