package dev.exercise.Spring.Repositories2.repositories;

import dev.exercise.Spring.Repositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
