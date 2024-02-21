package br.com.school.domain.student;

import lombok.Data;

@Data
public class Phone {
    
    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        if (number == null || ddd == null || !number.matches("\\d{8}|\\d{9}") || !ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid phone number.");
        }

        this.ddd = ddd;
        this.number = number;
    }
}
