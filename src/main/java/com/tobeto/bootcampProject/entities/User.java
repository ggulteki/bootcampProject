package com.tobeto.bootcampProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user-name")
    private String userName;

    @Column(name = "first-name")
    private String firstName;

    @Column(name = "last-name")
    private String lastName;

    @Column(name = "date-of-birth")
    private String dateOfBirth;

    @Column(name = "national-identity")
    private String nationalIdentity;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
