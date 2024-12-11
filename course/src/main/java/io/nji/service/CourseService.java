package io.nji.service;

import io.nji.model.Course;
import io.nji.repository.CourseRepository;
import io.nji.request.CourseRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CourseService(CourseRepository courseRepository) {
    public void register(CourseRequest registerRequest) {
        Course course = Course.builder()
                .name(registerRequest.name())
                .description(registerRequest.description())
                .skill_level(registerRequest.skill_level())
                .build();
//        TODO: Check if email exists
//        TODO: Check if email is valid


        courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }
}
