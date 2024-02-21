package br.com.school.application.recommendation;

import br.com.school.domain.student.Student;

public interface SendRecommendationEmail {
    
    void sendTo(Student student);
}
