package io.nji.service;

import io.nji.model.Student;
import io.nji.repository.StudentRepository;
import io.nji.request.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record StudentService(StudentRepository studentRepository) {
    public void register(StudentRequest registerRequest) {
        Student student = Student.builder()
                .name(registerRequest.name())
                .surname(registerRequest.surname())
                .email(registerRequest.email())
                .build();
//        TODO: Check if email exists
//        TODO: Check if email is valid


        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
            return studentRepository.findById(id).orElse(null);
    }
}
