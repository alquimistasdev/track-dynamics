package com.trackdynamics.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @Size(min = 2, max = 80, message = "name must be between 2 and 80 characters")
    @NotNull(message = "Name can not be null")
    private String name;
    @Column(name = "last_name")
    @Size(min = 2, max = 80, message = "Lastname must be between 2 and 80 characters")
    @NotNull(message = "Lastname can not be null")
    private String lastName;
    @Column
    @Size(min = 2, max = 80, message = "Password must be between 6 and 20 characters")
    @NotNull(message = "Password can not be null")
    private String password;
    @Column
    @Size(min = 2, max = 80, message = "Email must be between 2 and 80 characters")
    @NotNull(message = "Email can not be null")
    private String email;
}
