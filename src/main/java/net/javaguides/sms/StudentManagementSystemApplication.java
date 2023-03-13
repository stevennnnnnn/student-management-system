package net.javaguides.sms;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired // This means to get the bean called userRepository

    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception{
//        Student student1=new Student("Ramesh","Fadatare","ramesh@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2=new Student("Sanjay","Jadhav","sanjay@gmail");
//        studentRepository.save(student2);
//
//        Student student3=new Student("tony","stark","tony@gmail");
//        studentRepository.save(student3);
    }

}
