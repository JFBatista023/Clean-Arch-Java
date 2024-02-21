package br.com.school.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.school.domain.student.CPF;

class CPFTest {

    @Test
    void shouldNotAllowCreatingCPFWithInvalidNumbers() {
        assertThrows(IllegalArgumentException.class,
                    () -> new CPF(null));
                    
        assertThrows(IllegalArgumentException.class,
                    () -> new CPF(""));
                    
        assertThrows(IllegalArgumentException.class,
                    () -> new CPF("12345678900"));
    }
    
    @Test
    void shouldAllowCreatingCPFWithValidNumbers() {
        String number = "123.456.789-00";
        CPF cpf = new CPF(number);
        assertEquals(number, cpf.getNumber());
    }
}
