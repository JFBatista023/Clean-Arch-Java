package br.com.school.domain.recommendation;

import java.time.LocalDateTime;

import br.com.school.domain.student.Student;
import lombok.Data;

@Data
public class Recommendation {
    
    private Student indicated;
    private Student indicator;
    private LocalDateTime recommendationDate;

    public Recommendation(Student indicated, Student indicator) {
        this.indicated = indicated;
        this.indicator = indicator;
        this.recommendationDate = LocalDateTime.now();
    }
}
