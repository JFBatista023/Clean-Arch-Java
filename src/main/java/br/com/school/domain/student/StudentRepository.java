package br.com.school.domain.student;

import java.util.List;

public interface StudentRepository {
    
    void enrollStudent(Student student);

    Student findByCPF(CPF cpf);

    List<Student> findAllEnrolledStudents();
}
