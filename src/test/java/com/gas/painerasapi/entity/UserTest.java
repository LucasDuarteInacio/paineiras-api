package com.gas.painerasapi.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class UserTest {

    @Test
    public void validateNewIstanceUser() {
        String id = "1";
        String name = "name";
        String email = "email";
        String password = "password";
        String cellPhone = "cellPhone";
        String image = "image";
        String cpf = "cpf";
        LocalDate birthDate = LocalDate.now();
        String gender = "Woman";
        Address address = new Address();
        LocalDate registerSince = LocalDate.now();

        User user = new User(id,name,email,password,cellPhone,image,cpf,birthDate,gender,address,registerSince);

        assertNotNull(user);
        assertEquals(id,user.getId());
        assertEquals(name,user.getName());
        assertEquals(email,user.getEmail());
        assertEquals(password,user.getPassword());
        assertEquals(cellPhone,user.getCellPhone());
        assertEquals(image,user.getImage());
        assertEquals(cpf,user.getCpf());
        assertEquals(birthDate,user.getBirthDate());
        assertEquals(gender,user.getGender());
        assertEquals(address,user.getAddress());
        assertEquals(registerSince,user.getRegisterSince());
    }
}
