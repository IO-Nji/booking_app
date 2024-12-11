package io.nji.controller;

import io.nji.model.Course;
import io.nji.request.CourseRequest;
import io.nji.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/courses")
public record CourseController(CourseService courseService) {

    @PostMapping
    @RequestMapping("/register")
    public void registerCourse(@RequestBody CourseRequest courseRequest) {
        log.info("New Course Registration");
        courseService.register(courseRequest);
    }

    @GetMapping
    @RequestMapping("/get-all")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();}//TODO>

    @GetMapping("/get-by-id/{id}")
    public Course getCourseById(@PathVariable("id") int id) {
        return courseService.getCourseById(id);
    }
}