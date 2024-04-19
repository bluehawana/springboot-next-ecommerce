
package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * En repository-gränssnitt för att hantera åtkomst till historikdata i databasen.
 */
@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

    // Hämta historik för en specifik användare
    List<History> findByUserId(Long userId);
}
