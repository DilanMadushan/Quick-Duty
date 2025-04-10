package com.example.Quick_Duty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SignUpDTO{
    private String email;
    private String name;
    private int age ;
    private String Password;
}
