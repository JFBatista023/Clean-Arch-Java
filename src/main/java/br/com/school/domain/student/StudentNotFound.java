package br.com.school.domain.student;

public class StudentNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StudentNotFound(CPF cpf) {
        super("The student with the CPF " + cpf.getNumber() + " was not found.");
    }
    
}
