package com.shah.javacoretutorials.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Groceries {
    private Long id;
    private String item;
    private String brand;
    private String country;
    private String category;
    private BigDecimal price;
    private LocalDate expiryDate;
    private LocalDate arrivalDate;
}
