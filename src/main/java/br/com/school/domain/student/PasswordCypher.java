package br.com.school.domain.student;

public interface PasswordCypher {
    
    String encryptingPassword(String password);

    boolean validateEncryptedPassword(String encryptedPassword, String password);
}
