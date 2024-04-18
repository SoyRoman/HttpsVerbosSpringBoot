package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id.toString()); // Convertir el ID a String
    }

    public Student updateStudentPartially(Long id, Student student) {
        Optional<Student> existingStudentOptional = studentRepository.findById(id.toString()); // Convertir el ID a String
        if (existingStudentOptional.isPresent()) {
            Student existingStudent = existingStudentOptional.get();
            if (student.getFirstName() != null) {
                existingStudent.setFirstName(student.getFirstName());
            }
            if (student.getLastName() != null) {
                existingStudent.setLastName(student.getLastName());
            }
            // Continúa con otros campos si es necesario
            return studentRepository.save(existingStudent);
        } else {
            // Manejo si el estudiante no existe
            return null; // O lanza una excepción apropiada
        }
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id.toString()); // Convertir el ID a String
        return studentRepository.save(student);
    }

    public boolean exists(Long id) {
        return studentRepository.existsById(id.toString()); // Convertir el ID a String
    }
}
