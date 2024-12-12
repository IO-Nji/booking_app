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
@Table(name = "courses")
public class Course {
    @Id
    @SequenceGenerator(
            name ="course_id_sequence",
            sequenceName = "course_id_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_id_sequence")
    private int course_id;
    private String name;
    private String description;
    private String skill_level;
}