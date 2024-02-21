package br.com.school.student;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.school.domain.student.Email;

public class EmailTest {
    
    @Test
    void shouldAllowCreatingEmailsWithValidAddresses() {
        assertDoesNotThrow(() -> new Email("test@email.com"));
    }

    @Test
    void shouldNotAllowCreatingEmailsWithInvalidAddresses() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("testemail.com"));
        assertThrows(IllegalArgumentException.class, () -> new Email("test@emailcom"));
        assertThrows(IllegalArgumentException.class, () -> new Email("@email.com"));
    }
}
