package dev.pack.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    @JsonIgnoreProperties("student")
    private Address address;

    public void setDob(LocalDate dob) {
        this.dob = dob;
        if(dob != null) age = Period.between(dob, LocalDate.now()).getYears();
    }
}
