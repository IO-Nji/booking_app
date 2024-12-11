package io.nji.course_booking_app.repository;

import io.nji.course_booking_app.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MySqlRepository extends JpaRepository<Course, String> {
}
