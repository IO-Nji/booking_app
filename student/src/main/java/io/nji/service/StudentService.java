package io.nji.service;

import io.nji.model.Student;
import io.nji.repository.StudentRepository;
import io.nji.request.StudentRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    @PostMapping
    public void registerStudent(StudentRequest studentRequest) {
        log.info("New Student Registration");

        Student student = Student.builder()
                .name(studentRequest.name())
                .surname(studentRequest.surname())
                .email(studentRequest.email())
                .build();
        studentRepository.save(student);
    }

    @GetMapping("/get-all")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/get-student/{id}")
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

}
