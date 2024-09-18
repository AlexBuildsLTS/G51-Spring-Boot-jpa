package se.alex.lexicon.g51springbootjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.alex.lexicon.g51springbootjpa.model.Student;
import se.alex.lexicon.g51springbootjpa.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save a student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Find a student by ID
    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Delete a student by ID
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // Find a student by email (custom query)
    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}