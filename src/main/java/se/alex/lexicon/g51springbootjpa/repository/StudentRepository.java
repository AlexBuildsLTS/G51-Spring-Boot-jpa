package se.alex.lexicon.g51springbootjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51springbootjpa.model.Student;

// Extending JpaRepository to provide CRUD methods for Student
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom query to find a student by email
    Student findByEmail(String email);
}
