package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastname; // Error tipográfico en el nombre del atributo (debería ser lastName)
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favoriteSubjects;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;

    public Student(String firstName, String lastname, String email, Gender gender, Address address, List<String> favoriteSubjects, BigDecimal totalSpentInBooks, LocalDateTime created) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteSubjects = favoriteSubjects;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }

    // Método getter para el atributo lastName
    public String getLastName() {
        return lastname; // Utiliza el nombre correcto del atributo
    }

    // Método setter para el atributo lastName
    public void setLastName(String lastName) {
        this.lastname = lastName; // Utiliza el nombre correcto del atributo
    }
}
