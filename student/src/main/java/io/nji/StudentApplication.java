package io.nji;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {

        SpringApplication.run(StudentApplication.class, args);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Let the student begin!");
    }
}