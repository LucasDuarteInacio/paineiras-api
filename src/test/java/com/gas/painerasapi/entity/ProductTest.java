package com.gas.painerasapi.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class ProductTest {

    @Test
    public void validateNewIstanceProduct() {
        String id = "1";
        String name = "Product 1";
        BigDecimal price = new BigDecimal(10);
        String image = "image.jpg";

        Product product = new Product(id, name, price, image);

        assertNotNull(product);
        assertEquals(id, product.getId());
        assertEquals(name, product.getName());
        assertEquals(price, product.getPrice());
        assertEquals(image, product.getImage());


    }
}
