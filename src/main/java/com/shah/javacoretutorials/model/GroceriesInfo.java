package com.shah.javacoretutorials.model;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroceriesInfo {
    private Long id;
    private String item;
    private String brand;
    private String country;
    private String category;
    private BigDecimal costPrice;
    private Long quantity;
    private LocalDate expiryDate;
    private LocalDate arrivalDate;
}
