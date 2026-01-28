package com.shrivardhan.college;

import com.shrivardhan.college.model.Student;
import com.shrivardhan.college.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CollegeApplication {
    public static void main(String[] args){
        SpringApplication.run(CollegeApplication.class, args);

    }
    @Bean
    CommandLineRunner test(StudentService service){
        return args -> {
            Student s = new Student();
            s.setId(14L);
            s.setName("Shri14");
            s.setAge(14);
            service.createStudent(s);


            Student student = new Student();
            student.setId(15L);
            student.setName("Saanvi");
            student.setAge(15);
            service.createStudent(student);

            List<Student> students = service.getStudents();
            int size = students.size();

            for (int i = 1; i <students.size() ; i++) {
                System.out.println("ID " + students.get(i).getId());
                System.out.println("Name " + students.get(i).getName());
                System.out.println("age" + students.get(i).getAge());
            }

        };

    }
}
