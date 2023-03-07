package com.example.democallbacktemplate.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
}
