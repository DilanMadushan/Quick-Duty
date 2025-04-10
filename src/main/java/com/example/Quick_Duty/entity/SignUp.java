package com.example.Quick_Duty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class SignUp {
    @Id
    private String email;
    private String name;
    private int age ;
    private String Password;
}
