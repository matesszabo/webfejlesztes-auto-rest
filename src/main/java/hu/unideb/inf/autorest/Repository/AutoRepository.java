package hu.unideb.inf.autorest.Repository;

import hu.unideb.inf.autorest.Entity.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<AutoEntity, Long> {
}
