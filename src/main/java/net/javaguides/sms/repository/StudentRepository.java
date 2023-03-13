package net.javaguides.sms.repository;

import jakarta.servlet.http.Cookie;
import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    //this will be auto implemented by spring into a bean called userRespository

}
