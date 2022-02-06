package com.gas.painerasapi.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String cellPhone;
    private String image;
    private String cpf;
    private LocalDate birthDate;
    private String gender;
    private Address address;
    private LocalDate registerSince;
}
