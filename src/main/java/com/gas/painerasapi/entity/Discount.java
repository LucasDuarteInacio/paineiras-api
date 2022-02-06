package com.gas.painerasapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "discount")
public class Discount {

    @Id
    private String id;
    private Double percentage;
    private BigDecimal value;
    private Product product;
    private Integer quantity;
    private String paymentMethod;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer priority;
    private Boolean active;
}
