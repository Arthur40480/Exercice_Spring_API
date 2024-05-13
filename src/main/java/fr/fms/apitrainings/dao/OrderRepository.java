package fr.fms.apitrainings.dao;

import fr.fms.apitrainings.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Commande, Long> {
}
