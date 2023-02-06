package com.trackdynamics.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.trackdynamics.entity.User;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class TaskDTO {
    private Integer id;
    @Size(min = 2, max = 80, message = "title must be between 2 and 80 characters")
    @NotNull(message = "Title can not be null")
    private String title;
    private String description;
    private LocalDate deadline;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateCreation;
    private Integer idUser;
    private String priority;
    private Boolean overdue;
}
