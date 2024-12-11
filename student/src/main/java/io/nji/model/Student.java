package io.nji.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @SequenceGenerator(
            name ="student_id_sequence",
            sequenceName = "student_id_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_id_sequence")
    private int student_id;
    private String name;
    private String surname;
    private String email;
}
