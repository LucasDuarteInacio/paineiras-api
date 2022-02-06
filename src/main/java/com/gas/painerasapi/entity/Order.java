package com.gas.painerasapi.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "order")
public class Order {


    @Id
    private String id;
    private User user;
    private String status;
    private List<Product> products;
    private String paymentMethod;
    private BigDecimal freight;
    private Discount discount;
    private BigDecimal total;
    private Integer rating;
    private String ratingComment;
    private LocalDate date;
    private LocalTime initialTime;
    private LocalTime finalTime;
}
