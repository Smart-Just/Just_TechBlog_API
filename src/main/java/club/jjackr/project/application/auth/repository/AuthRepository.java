package club.jjackr.project.application.auth.repository;

import club.jjackr.project.application.auth.entity.SignUpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<SignUpEntity, Long> {

}
