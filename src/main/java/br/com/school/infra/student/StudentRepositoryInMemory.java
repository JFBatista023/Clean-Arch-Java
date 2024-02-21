package br.com.school.infra.student;

import java.util.ArrayList;
import java.util.List;

import br.com.school.domain.student.CPF;
import br.com.school.domain.student.Student;
import br.com.school.domain.student.StudentNotFound;
import br.com.school.domain.student.StudentRepository;

public class StudentRepositoryInMemory implements StudentRepository {

    private List<Student> enrrolledStudents = new ArrayList<>();

    @Override
    public void enrollStudent(Student student) {
        this.enrrolledStudents.add(student);
    }

    @Override
    public Student findByCPF(CPF cpf) {
        return this.enrrolledStudents.stream().filter(student -> student.getCpf().getNumber().equals(cpf.getNumber())).findFirst().orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> findAllEnrolledStudents() {
        return this.enrrolledStudents;
    }
    
}
