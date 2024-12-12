package io.nji.service;

import io.nji.model.Course;
import io.nji.repository.CourseRepository;
import io.nji.request.CourseRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    @PostMapping
    public void registerCourse(CourseRequest courseRequest) {
        log.info("New Course Registration");

        Course course = Course.builder()
                .name(courseRequest.name())
                .description(courseRequest.description())
                .skill_level(courseRequest.skill_level())
                .build();
        courseRepository.save(course);
    }

    @GetMapping("/get-all")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/get-course/{id}")
    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

}
