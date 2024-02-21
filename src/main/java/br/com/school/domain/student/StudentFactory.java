package br.com.school.domain.student;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameCPFAndEmail(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }
    
    public StudentFactory withPhone(String ddd, String number) {
        this.student.addPhone(ddd, number);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
