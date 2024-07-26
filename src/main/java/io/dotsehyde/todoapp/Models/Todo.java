package io.dotsehyde.todoapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Todo {
    @Id
    private int id;

    private String username;
    private LocalDate targetDate;
    private String description;
    private Boolean done;
}
