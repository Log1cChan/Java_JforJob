package com.demo.backend_demo.model.vo;

import com.demo.backend_demo.model.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonVO {
    /**
     * @program: backend_demo
     * @description: VO
     * @author: Log1c
     * @create: 2022-01-29 22:53
     **/

    private Long id;
    private String name;
    private String email;

    public static Person to(PersonVO personVO){
        return new Person(
                personVO.getId(),
                personVO.getName(),
                personVO.getEmail()
        );
    }

    public static PersonVO from(Person person){
        return new PersonVO(
                person.getId(),
                person.getName(),
                person.getEmail()
        );
    }
}
