package fr.fms.apitrainings.dao;

import fr.fms.apitrainings.entities.User;
import fr.fms.apitrainings.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByUser(User user);
}
