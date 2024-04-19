package org.campusmolndal.grupp2ecoeatsab.repositories;

import org.campusmolndal.grupp2ecoeatsab.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Ett repository-gränssnitt för att hantera åtkomst till rolldata i databasen.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {



}
