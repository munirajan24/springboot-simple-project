package com.springpro.springpro.repo;

import com.springpro.springpro.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
