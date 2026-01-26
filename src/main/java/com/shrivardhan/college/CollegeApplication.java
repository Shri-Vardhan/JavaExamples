package com.shrivardhan.college;

import com.shrivardhan.college.model.Student;
import com.shrivardhan.college.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CollegeApplication {
    public static void main(String[] args){
        SpringApplication.run(CollegeApplication.class, args);

    }
    @Bean
    CommandLineRunner test(StudentService service){
        return args -> {
            Student s = new Student();
            s.setId(1L);
            s.setName("Shri");
            s.setAge(18);

            service.createStudent(s);
        };

    }
}
