package com.gas.painerasapi.entity;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void validateNewIstanceOrder() {
        String id = "1";
        User user = new User();
        String status = "PENDING";
        List<Product> products = List.of(new Product());
        String paymentMethod = "CREDIT_CARD";
        BigDecimal freight = new BigDecimal(10);
        Discount discount = new Discount();
        BigDecimal total = new BigDecimal(100);
        Integer rating = 5;
        String ratingComment = "Good";
        LocalDate date = LocalDate.now();
        LocalTime initialTime = LocalTime.now();
        LocalTime finalTime = LocalTime.now();

        Order order = new Order(id, user, status, products, paymentMethod, freight, discount, total, rating, ratingComment, date, initialTime, finalTime);

        assertNotNull(order);
        assertEquals(id, order.getId());
        assertEquals(user, order.getUser());
        assertEquals(status, order.getStatus());
        assertEquals(products, order.getProducts());
        assertEquals(paymentMethod, order.getPaymentMethod());
        assertEquals(freight, order.getFreight());
        assertEquals(discount, order.getDiscount());
        assertEquals(total, order.getTotal());
        assertEquals(rating, order.getRating());
        assertEquals(ratingComment, order.getRatingComment());
        assertEquals(date, order.getDate());
        assertEquals(initialTime, order.getInitialTime());
        assertEquals(finalTime, order.getFinalTime());


    }
}
