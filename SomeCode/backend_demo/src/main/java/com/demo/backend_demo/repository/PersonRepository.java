package com.demo.backend_demo.repository;

import com.demo.backend_demo.model.db.PersonDb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonDb, Long> {
    /**
     * @program: backend_demo
     * @description: Interface of JPA
     * @author: Log1c
     * @create: 2022-01-29 22:54
     **/
    Object findPersonByName(String name);
    Object findPersonById(Long id);

}
