package com.example.junit5learn.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
   private String name;

   private String lastName;
   
   private String firstName;

    public Person(String john, String doe) {
        this.firstName = john;
        this.lastName = doe;
        this.name = firstName + " " + lastName;
    }
}
