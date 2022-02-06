package com.demo.backend_demo.model.db;


import com.demo.backend_demo.model.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonDb {
    /**
     * @program: backend_demo
     * @description: The class which associate with Db
     * @author: Log1c
     * @create: 2022-01-29 22:46
     **/
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "email", nullable = true, length = 20)
    private String email;

    public static Person to(PersonDb personDb){
        return new Person(
                personDb.getId(),
                personDb.getName(),
                personDb.getEmail()
        );
    }

    public static PersonDb from(Person person){
        return new PersonDb(
                person.getId(),
                person.getName(),
                person.getEmail()
        );
    }
}
