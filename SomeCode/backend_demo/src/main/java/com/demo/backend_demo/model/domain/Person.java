package com.demo.backend_demo.model.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    /**
     * @program: backend_demo
     * @description: The domain obj
     * @author: Log1c
     * @create: 2022-01-29 22:51
     **/

    private Long id;
    private String name;
    private String email;

}
