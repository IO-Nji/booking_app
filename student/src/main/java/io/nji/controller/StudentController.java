package io.nji.controller;

import io.nji.model.Student;
import io.nji.request.StudentRequest;
import io.nji.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @RequestMapping("/register")
    public void registerStudent(@RequestBody StudentRequest studentRequest) {
        log.info("New Student Registration");
        studentService.registerStudent(studentRequest);
    }

    @GetMapping
    @RequestMapping("/get-all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }//TODO>

    @GetMapping("/get-by-id/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }
}