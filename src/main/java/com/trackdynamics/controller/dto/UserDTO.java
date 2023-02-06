package com.trackdynamics.controller.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class UserDTO {
    private Integer id;

    @Size(min = 2, max = 80, message = "name must be between 2 and 80 characters")
    @NotNull(message = "Name can not be null")
    private String name;

    @Size(min = 2, max = 80, message = "Lastname must be between 2 and 80 characters")
    @NotNull(message = "Lastname can not be null")
    private String lastName;

    @Size(min = 2, max = 80, message = "Password must be between 6 and 20 characters")
    @NotNull(message = "Password can not be null")
    private String password;

    @Size(min = 2, max = 80, message = "Email must be between 2 and 80 characters")
    @NotNull(message = "Email can not be null")
    private String email;
}
