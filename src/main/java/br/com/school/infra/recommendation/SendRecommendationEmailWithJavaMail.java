package br.com.school.infra.recommendation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import br.com.school.application.recommendation.SendRecommendationEmail;
import br.com.school.domain.student.Student;

public class SendRecommendationEmailWithJavaMail implements SendRecommendationEmail {

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String fromEmail;

    public SendRecommendationEmailWithJavaMail(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendTo(Student student) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(fromEmail);
        mailMessage.setTo(student.getEmail().getAddress());
        mailMessage.setSubject("Subject of the Email");
        mailMessage.setText("Hello " + student.getName());

        javaMailSender.send(mailMessage);
    }
    
}
