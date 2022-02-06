package com.gas.painerasapi.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void validadeNewInstanceAddress() {
        String id = "id01";
        String street = "Rua dos Bobos";
        String number = "123";
        String city = "São Paulo";
        String state = "SP";
        String cep = "12345-678";
        String complement = "Casa";
        String neighborhood = "Centro";
        String reference = "Perto da escola";
        Address address = new Address(id, cep,state,city,neighborhood,street,number,complement,reference);

        assertNotNull(address);
        assertEquals(id, address.getId());
        assertEquals(cep, address.getCep());
        assertEquals(state, address.getState());
        assertEquals(city, address.getCity());
        assertEquals(neighborhood, address.getNeighborhood());
        assertEquals(street, address.getStreet());
        assertEquals(number, address.getNumber());
        assertEquals(complement, address.getComplement());
        assertEquals(reference, address.getReference());
    }
}
