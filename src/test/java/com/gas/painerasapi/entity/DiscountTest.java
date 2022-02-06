package com.gas.painerasapi.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DiscountTest {

    @Test
    public void validateNewIstanceDiscount() {
        String id = "1";
        Double percentage = 10.0;
        BigDecimal value = new BigDecimal(10.0);
        Product product = new Product();
        Integer quantity = 10;
        String paymentMethod = "credit";
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.now();
        Integer priority = 1;
        Boolean active = true;

        Discount discount = new Discount(id, percentage, value, product, quantity, paymentMethod, startDate, endDate, priority, active);

        assertNotNull(discount);
        assertEquals(id, discount.getId());
        assertEquals(percentage, discount.getPercentage());
        assertEquals(value, discount.getValue());
        assertEquals(product, discount.getProduct());
        assertEquals(quantity, discount.getQuantity());
        assertEquals(paymentMethod, discount.getPaymentMethod());
        assertEquals(startDate, discount.getStartDate());
        assertEquals(endDate, discount.getEndDate());
        assertEquals(priority, discount.getPriority());
        assertEquals(active, discount.getActive());

    }
}
