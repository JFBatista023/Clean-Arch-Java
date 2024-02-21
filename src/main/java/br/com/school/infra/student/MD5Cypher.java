package br.com.school.infra.student;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.school.domain.student.PasswordCypher;

public class MD5Cypher implements PasswordCypher {

    @Override
    public String encryptingPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes [i] & 0xff) + 0x100));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean validateEncryptedPassword(String encryptedPassword, String password) {
        return encryptedPassword.equals(encryptingPassword(password));
    }
    
}
