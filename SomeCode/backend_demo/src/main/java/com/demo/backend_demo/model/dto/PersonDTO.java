package com.demo.backend_demo.model.dto;


import com.demo.backend_demo.model.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonDTO {
    /**
     * @program: backend_demo
     * @description: DTO
     * @author: Log1c
     * @create: 2022-01-29 22:52
     **/

    private Long id;
    private String name;
    private String email;

    public static Person to(PersonDTO personDTO){
        return new Person(
                personDTO.getId(),
                personDTO.getName(),
                personDTO.getEmail()
        );
    }

    public static PersonDTO from(Person person){
        return new PersonDTO(
                person.getId(),
                person.getName(),
                person.getEmail()
        );
    }
}
