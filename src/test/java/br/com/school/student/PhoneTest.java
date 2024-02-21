package br.com.school.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.school.domain.student.Phone;

public class PhoneTest {
    
     @Test
    void shouldNotAllowCreatingPhoneNumbersWithInvalidDDD() {
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone(null, "123456789"));
        
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone("", "123456789"));
                    
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone("1", "123456789"));
    }
    
    @Test
    void shouldNotAllowCreatingPhoneNumbersWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone("11", null));
        
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone("11", ""));
                    
        assertThrows(IllegalArgumentException.class,
                    () -> new Phone("11", "123"));
    }
    
    @Test
    void shouldAllowCreatingPhoneNumbersWithValidDDDAndNumbers() {
        String ddd = "11";
        String number = "123456789";
        Phone phone = new Phone(ddd, number);
        assertEquals(ddd, phone.getDdd());
        assertEquals(number, phone.getNumber());
    }
}
