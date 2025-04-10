package com.example.Quick_Duty.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "task")
public class Task{
    @Id
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
}
