package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Ett repository-gränssnitt för att hantera åtkomst till användardata i databasen.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Ytterligare anpassade metoder kan läggas till här vid behov

}
