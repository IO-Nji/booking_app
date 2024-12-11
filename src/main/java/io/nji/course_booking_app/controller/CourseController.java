package io.nji.course_booking_app.controller;
import io.nji.course_booking_app.model.Course;
import io.nji.course_booking_app.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private MySqlRepository mySqlRepository;

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping ("/get-all-courses") // "/get-all-courses")
    public List<Course> getAllCourses() {
        return mySqlRepository.findAll();
    }

    @GetMapping("/get-course/{courseName}")
    public Optional<Course> getCourse(@PathVariable("course_name") String courseName) {
        return mySqlRepository.findById(courseName);
    }

}
