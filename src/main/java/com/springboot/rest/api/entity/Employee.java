package com.springboot.rest.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Value;

@Data
@Entity
@Table(name="employee_data")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


}
